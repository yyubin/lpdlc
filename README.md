# LPDL Compiler

**LPDL (Limbus Persona Description Language)** - 림버스 컴퍼니 게임 데이터를 위한 선언적 DSL 컴파일러

[![Build](https://img.shields.io/badge/build-passing-brightgreen)]()
[![Language](https://img.shields.io/badge/language-Java%2021-orange)]()
[![License](https://img.shields.io/badge/license-MIT-blue)]()

## 목차

- [개요](#개요)
- [주요 기능](#주요-기능)
- [빠른 시작](#빠른-시작)
- [설치 및 설정](#설치-및-설정)
- [사용법](#사용법)
  - [1. LPDL → SQL 컴파일](#1-lpdl--sql-컴파일)
  - [2. 자연어 → SQL 컴파일](#2-자연어--sql-컴파일)
- [문서](#문서)
- [프로젝트 구조](#프로젝트-구조)
- [기술 스택](#기술-스택)

---

## 개요

LPDL Compiler는 림버스 컴퍼니 게임의 인격(Persona), 스킬, 패시브 등을 선언적으로 기술하고 MySQL SQL로 변환하는 도구입니다.

### 두 가지 컴파일 방식

```
방식 1: LPDL → SQL
┌──────────┐    ┌─────────┐    ┌──────┐
│ .lpdl    │ -> │ ANTLR   │ -> │ SQL  │
│ 파일     │    │ Parser  │    │ 출력 │
└──────────┘    └─────────┘    └──────┘

방식 2: 자연어 → LPDL → SQL
┌──────────┐    ┌──────┐    ┌─────────┐    ┌──────┐
│ 자연어   │ -> │ LLM  │ -> │ ANTLR   │ -> │ SQL  │
│ 설명     │    │(GPT) │    │ Parser  │    │ 출력 │
└──────────┘    └──────┘    └─────────┘    └──────┘
```

---

## 주요 기능

### ✨ LPDL → SQL 컴파일러
- ✅ ANTLR 기반 파서 (문법 검증)
- ✅ JPA 엔티티와 1:1 매핑
- ✅ MySQL 호환 SQL 생성
- ✅ AUTO_INCREMENT 자동 처리
- ✅ 외래 키 자동 연결

### 🤖 자연어 → SQL 컴파일러 (NEW!)
- ✅ LLM 기반 자연어 처리 (OpenAI GPT-4)
- ✅ 자동 재시도 및 에러 피드백
- ✅ 대화형 모드
- ✅ .env 파일로 API 키 관리
- ✅ 중간 LPDL 파일 저장

---

## 빠른 시작

### 5분 안에 시작하기

#### 1. LPDL 파일 컴파일

```bash
# LPDL 파일을 SQL로 변환
./gradlew run --args='example_honglu.lpdl output.sql'
```

#### 2. 자연어로 SQL 생성

```bash
# API 키 설정
cp .env.example .env
# .env 파일에 OPENAI_API_KEY 입력

# 자연어로 SQL 생성
./gradlew nlcompile -Pargs='"홍루 페르소나를 만들어줘. 등급은 3이야."'
```

**더 자세한 내용**: [QUICK_START.md](QUICK_START.md)

---

## 설치 및 설정

### 요구사항

- **Java**: 21 이상
- **Gradle**: 8.0 이상 (wrapper 포함)
- **OpenAI API 키**: 자연어 컴파일러 사용 시 (선택)

### 설치

```bash
# 저장소 클론
git clone <repository-url>
cd LPDLc

# 빌드
./gradlew build

# 테스트
./gradlew test
```

### API 키 설정 (자연어 컴파일러용)

```bash
# .env 파일 생성
cp .env.example .env

# .env 파일 편집
# OPENAI_API_KEY=your-api-key-here
```

---

## 사용법

### 1. LPDL → SQL 컴파일

#### 기본 사용

```bash
# 콘솔에 출력
./gradlew run --args='input.lpdl'

# 파일로 저장
./gradlew run --args='input.lpdl output.sql'
```

#### LPDL 예제

```lpdl
persona "홍루" {
  sinner "홍루"
  grade 3
  release "2023-02-27"
  maxLevel 50

  resistance {
    slash NORMAL,
    pierce WEAK,
    blunt RESIST
  }

  speed {
    min 3,
    max 5
  }

  health {
    base 80,
    growth 7.5,
    disturbed [30, 50, 70]
  }

  skill 3 "오베르튀레" {
    category ATTACK
    sin WRATH
    attack PIERCE
    quantity 2
    keyword BLEED

    sync SYNC_4 {
      basePower 5
      coinPower 8
      coinCount 3
      weight 1
      level 40
    }
  }
}
```

#### 생성된 SQL

```sql
INSERT INTO persona (name) VALUES ('홍루');
SET @persona_1 = LAST_INSERT_ID();
UPDATE persona SET sinner_name = '홍루' WHERE id = @persona_1;
UPDATE persona SET grade = 'THREE' WHERE id = @persona_1;
UPDATE persona SET release_date = '2023-02-27' WHERE id = @persona_1;
UPDATE persona SET max_level = 50 WHERE id = @persona_1;
UPDATE persona SET slash_resistance = 'NORMAL',
                   penetration_resistance = 'WEAK',
                   blunt_resistance = 'RESIST' WHERE id = @persona_1;
-- ... 더 많은 SQL ...
```

---

### 2. 자연어 → SQL 컴파일

#### 기본 사용

```bash
# 간단한 자연어 입력
./gradlew nlcompile -Pargs='"홍루 페르소나를 만들어줘. 등급은 3이고 죄인은 홍루야."'
```

#### 파일 입력/출력

```bash
# 파일에서 읽어서 SQL 생성
./gradlew nlcompile -Pargs='--input description.txt --output result.sql'
```

#### 대화형 모드

```bash
./gradlew nlcompile -Pargs='--interactive'
```

```
LPDL Natural Language Compiler (Interactive Mode)
명령어: exit (종료), help (도움말)

> 홍루 페르소나를 만들어줘. 등급은 3이야.
[1/3] LLM으로 LPDL 생성 중...
[2/3] LPDL 검증 중...
✓ 검증 통과
[3/3] SQL 변환 중...
✓ 성공!

생성된 SQL:
INSERT INTO persona (name) VALUES ('홍루');
...

> exit
종료합니다.
```

#### 중간 LPDL 저장

```bash
# LPDL 파일도 함께 저장
./gradlew nlcompile -Pargs='"..." --save-lpdl persona.lpdl --output result.sql'
```

#### 옵션

| 옵션 | 설명 | 기본값 |
|------|------|--------|
| `-i, --input <file>` | 입력 파일 (자연어 설명) | - |
| `-o, --output <file>` | 출력 파일 (SQL) | 콘솔 출력 |
| `--save-lpdl <file>` | 중간 LPDL 저장 | - |
| `-p, --provider <name>` | LLM 제공자 (openai) | openai |
| `-m, --model <name>` | 모델 지정 | gpt-4 |
| `--max-retries <n>` | 최대 재시도 횟수 | 3 |
| `-v, --verbose` | 상세 로그 출력 | false |
| `--dry-run` | LPDL만 생성 (SQL 변환 생략) | false |
| `--interactive` | 대화형 모드 | false |
| `-h, --help` | 도움말 출력 | - |

---

## 문서

### 사용자 가이드
- **[QUICK_START.md](QUICK_START.md)** - 5분 퀵스타트 가이드
- **[README_NL_COMPILER.md](README_NL_COMPILER.md)** - 자연어 컴파일러 완전 가이드

### 언어 스펙
- **[LPDL_LANGUAGE_SPEC.md](LPDL_LANGUAGE_SPEC.md)** - LPDL 문법 완전판
- **[LPDL_GRAMMAR_CHANGELOG.md](LPDL_GRAMMAR_CHANGELOG.md)** - 문법 변경 이력

### 설계 문서
- **[NL_TO_SQL_PIPELINE_DESIGN.md](NL_TO_SQL_PIPELINE_DESIGN.md)** - 자연어 파이프라인 설계
- **[AST_TO_EXPORTER_DESIGN.md](AST_TO_EXPORTER_DESIGN.md)** - AST → SQL 변환 설계
- **[JPA_LPDL_DISCREPANCIES.md](JPA_LPDL_DISCREPANCIES.md)** - JPA 엔티티 매핑 문서

---

## 프로젝트 구조

```
LPDLc/
├── src/
│   ├── main/
│   │   ├── java/org/yyubin/lpdl/
│   │   │   ├── Main.java                    # LPDL → SQL CLI
│   │   │   ├── NaturalLanguageCompiler.java # 자연어 → SQL CLI
│   │   │   ├── exporter/
│   │   │   │   ├── RDBExporter.java         # SQL 변환기
│   │   │   │   ├── sql/                     # SQL 생성 유틸
│   │   │   │   └── util/                    # 변환 유틸리티
│   │   │   ├── parser/                      # ANTLR 생성 파서
│   │   │   ├── llm/                         # LLM 클라이언트
│   │   │   │   ├── LLMClient.java
│   │   │   │   └── OpenAIClient.java
│   │   │   ├── prompt/                      # 프롬프트 관리
│   │   │   │   ├── PromptTemplate.java
│   │   │   │   └── LPDLGrammarSpec.java
│   │   │   └── pipeline/                    # 파이프라인
│   │   │       └── NLToSQLPipeline.java
│   │   └── antlr/
│   │       └── LPDL.g4                      # ANTLR 문법 정의
│   └── test/                                # 테스트
├── .env.example                             # API 키 예제
├── build.gradle.kts                         # Gradle 설정
├── README.md                                # 이 파일
├── QUICK_START.md                           # 퀵스타트
├── README_NL_COMPILER.md                    # 자연어 컴파일러 가이드
└── example_*.lpdl                           # 예제 파일
```

---

## 기술 스택

### 핵심 기술
- **Java 21** - 주 프로그래밍 언어
- **ANTLR 4** - 파서 생성기
- **Gradle** - 빌드 도구

### 의존성
- **OkHttp** (4.12.0) - HTTP 클라이언트
- **Gson** (2.10.1) - JSON 파싱
- **Picocli** (4.7.5) - CLI 프레임워크
- **Dotenv-java** (3.0.0) - 환경 변수 관리
- **JUnit 5** - 테스트 프레임워크

### 외부 서비스
- **OpenAI API** (GPT-4) - 자연어 처리 (선택)

---

## 예제

### 예제 파일

프로젝트에 포함된 예제:

- **test_simple.lpdl** - 간단한 페르소나
- **test_action.lpdl** - 액션 문법 테스트
- **example_honglu.lpdl** - 복잡한 실전 예제
- **example_nl_description.txt** - 자연어 설명 예제

### 실행 예제

```bash
# 예제 1: 간단한 LPDL 컴파일
./gradlew run --args='test_simple.lpdl'

# 예제 2: 복잡한 LPDL 컴파일
./gradlew run --args='example_honglu.lpdl honglu.sql'

# 예제 3: 자연어로 생성
./gradlew nlcompile -Pargs='--input example_nl_description.txt --output result.sql --save-lpdl result.lpdl'
```

---

## 특징

### LPDL 언어의 장점

1. **선언적 문법**: 게임 데이터를 직관적으로 표현
2. **타입 안정성**: JPA 엔티티와 1:1 매핑
3. **조건 표현식**: AND/OR/NOT 논리 연산 지원
4. **산술 표현식**: 수식 계산 지원
5. **한글 리터럴**: 문자열에 한글 사용 가능
6. **주석 지원**: `//` 라인 주석, `/* */` 블록 주석

### 자연어 컴파일러의 장점

1. **자동 재시도**: 구문 오류 시 LLM에게 피드백하여 자동 수정
2. **대화형 모드**: 단계별로 대화하며 생성 가능
3. **에러 검증**: ANTLR 파서로 생성된 LPDL 즉시 검증
4. **중간 파일 저장**: LPDL 파일도 함께 저장하여 확인 가능

---

## 테스트

```bash
# 전체 테스트 실행
./gradlew test

# 특정 테스트만 실행
./gradlew test --tests RDBExporterTest

# 테스트 + 빌드
./gradlew build
```

---

## 문제 해결

### "오류: API 키가 설정되지 않았습니다"

```bash
# .env 파일 확인
cat .env

# API 키가 올바른지 확인
# OPENAI_API_KEY=sk-proj-...
```

### "컴파일 실패: LPDL 구문 오류"

```bash
# 재시도 횟수 증가
./gradlew nlcompile -Pargs='"..." --max-retries 5 --verbose'

# 또는 LPDL만 생성하여 확인
./gradlew nlcompile -Pargs='"..." --dry-run'
```

### 파싱 에러

LPDL 파일에 문법 오류가 있을 경우:
1. 문법 스펙 확인: [LPDL_LANGUAGE_SPEC.md](LPDL_LANGUAGE_SPEC.md)
2. 예제 파일 참고: `example_honglu.lpdl`
3. 에러 메시지의 line:column 확인

---

## 기여

이슈 및 PR 환영합니다!

---

## 라이선스

MIT License

---

## 작성자

LPDL Compiler Team

---

## 링크

- **GitHub**: [repository-url]
- **문서**: [docs-url]
- **이슈**: [issues-url]
