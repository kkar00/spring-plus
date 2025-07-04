package org.example.expert.domain.todo.repository;

import static org.example.expert.domain.todo.entity.QTodo.todo;

import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.example.expert.domain.todo.entity.Todo;
import org.example.expert.domain.user.entity.QUser;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class QueryDslTodoRepositoryImpl implements QueryDslTodoRepository {

    public final JPAQueryFactory jpaQueryFactory;

    @Override
    public Optional<Todo> findByIdWithUser(Long todoId) {
        QUser user = QUser.user;

        return jpaQueryFactory.select(todo)
                              .leftJoin(todo.user, user).fetchJoin()
                              .where(todo.id.eq(todoId))
                              .stream().findAny();
    }
}