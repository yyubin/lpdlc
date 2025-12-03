# LPDL Compiler

**LPDL (Limbus Persona Description Language)** - 림버스 컴퍼니 게임 데이터를 위한 선언적 DSL 컴파일러

## 목차

- [개요](#개요)
- [주요 기능](#주요-기능)
- [빠른 시작](#빠른-시작)
- [설치](#설치)
- [사용법](#사용법)
- [문서](#문서)
- [기술 스택](#기술-스택)

---

## 개요

LPDL Compiler는 림버스 컴퍼니 게임의 인격(Persona), 스킬, 패시브 등을 선언적으로 기술하고 데이터베이스 쿼리로 변환하는 컴파일러입니다.

### 지원 데이터베이스

- **MySQL** (현재 지원)
- **Neo4j** (향후 지원 예정)

### 컴파일 방식

**방식 1: LPDL → 데이터베이스 쿼리**
```
.lpdl 파일 → ANTLR Parser → MySQL SQL (현재) / Neo4j Cypher (예정)
```

**방식 2: 자연어 → LPDL → 데이터베이스 쿼리**
```
자연어 설명 → LLM (GPT-4) → LPDL → ANTLR Parser → 데이터베이스 쿼리
```

---

## 주요 기능

### LPDL → SQL 컴파일러
- ANTLR 기반 문법 검증
- JPA 엔티티와 1:1 매핑
- MySQL 호환 SQL 생성
- AUTO_INCREMENT 및 외래 키 자동 처리

### 자연어 → SQL 컴파일러
- LLM 기반 자연어 처리 (OpenAI GPT-4)
- 구문 오류 자동 재시도 및 피드백
- 대화형 모드 지원
- .env 파일 기반 API 키 관리

### 향후 계획
- Neo4j Cypher 쿼리 생성 지원
---

## 빠른 시작

### LPDL 파일 컴파일

```bash
./gradlew run --args='example_honglu.lpdl output.sql'
```

### 자연어로 SQL 생성

```bash
# API 키 설정
cp .env.example .env
# .env 파일에 OPENAI_API_KEY 입력

# 실행
./gradlew nlcompile -Pargs='"홍루 페르소나를 만들어줘. 등급은 3이야."'
```

---

## 설치

### 요구사항
- Java 21+
- Gradle 8.0+
- OpenAI API 키 (자연어 컴파일러 사용 시)

### 빌드

```bash
git clone <repository-url>
cd LPDLc
./gradlew build
```

### API 키 설정

```bash
cp .env.example .env
# .env 파일에서 OPENAI_API_KEY 설정
```

---

## 사용법

### LPDL 파일 컴파일

```bash
# 콘솔 출력
./gradlew run --args='input.lpdl'

# 파일 저장
./gradlew run --args='input.lpdl output.sql'
```

### 자연어 컴파일

```bash
# 기본 사용
./gradlew nlcompile -Pargs='"홍루 페르소나를 만들어줘. 등급은 3이고 죄인은 홍루야."'

# 파일 입력/출력
./gradlew nlcompile -Pargs='--input description.txt --output result.sql'

# 대화형 모드
./gradlew nlcompile -Pargs='--interactive'

# LPDL 중간 파일 저장
./gradlew nlcompile -Pargs='"..." --save-lpdl persona.lpdl --output result.sql'
```

### 주요 옵션

| 옵션 | 설명 |
|------|------|
| `-i, --input <file>` | 입력 파일 경로 |
| `-o, --output <file>` | 출력 파일 경로 |
| `--save-lpdl <file>` | 중간 LPDL 파일 저장 |
| `--max-retries <n>` | 최대 재시도 횟수 (기본: 3) |
| `-v, --verbose` | 상세 로그 출력 |
| `--interactive` | 대화형 모드 |

전체 옵션: `./gradlew nlcompile -Pargs='--help'`

---

## 기술 스택

### 핵심
- Java 21
- ANTLR 4
- Gradle

### 의존성
- OkHttp 4.12.0 - HTTP 클라이언트
- Gson 2.10.1 - JSON 파싱
- Picocli 4.7.5 - CLI 프레임워크
- Dotenv-java 3.0.0 - 환경 변수 관리
- JUnit 5 - 테스트

### 외부 서비스
- OpenAI GPT-4 - 자연어 처리 (선택)

