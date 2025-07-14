# 🧊 Cache을 이용한 성능개선 프로젝트

> **“이 조… Chill하다…”**

## 👥 팀원 및 역할 분담

| 이름   | 역할  | 주요 담당 업무 |
| ------ | ----- | -------------- |
| 최경진 | 팀장  | 로그인/로그아웃, Refresh Token 재발급 API (JJWT, Spring Security 기반 인증/인가) |
| 안요한 | 팀원  | 댓글 API (CRUD, 페이지네이션), BaseEntity (LocalDateTime, Soft Delete), 공통 응답 객체 (ApiResponse) |
| 안지현 | 팀원  | 회원가입, 회원조회, 회원수정, 회원삭제 (소프트 딜리트 방식) |
| 곽현민 | 팀원  | 태스크 API (생성, 조회, 수정, 삭제) |
| 우지운 | 팀원  | 로그 조회, 로그 자동 저장 API |

---

## 🛠 사용 기술

| 구분        | 내용 |
| ----------- | ---- |
| **언어** | Java 17 |
| **프레임워크** | Spring Boot 3.5.0 |
| **빌드 도구** | Gradle 8.5 |
| **ORM** | Spring Data JPA (Hibernate 6.6.13.Final), QueryDSL 5.1.0 |
| **데이터베이스** | MySQL 8.0 이상 (JDBC Driver) |
| **보안** | Spring Security, JWT (jjwt 0.11.5), 비밀번호 암호화 (BCrypt 0.10.2) |
| **라이브러리** | Lombok |
| **API 테스트** | Postman |
| **DB 설계** | ERD Cloud |
| **개발 환경** | IntelliJ IDEA |

---

## 📁 폴더 구조

