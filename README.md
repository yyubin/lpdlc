# LPDLc

**LPDLc (Limbus Persona Definition Language Compiler)**
림버스 컴퍼니 전용 데이터 DSL을 정의하고, 이를 파싱 및 변환하는 컴파일러 프로젝트입니다.
ANTLR 4를 기반으로 작성되었으며, LPDL 문법을 통해 인격(Persona), 스킬(Skill), 패시브(Passive), 시너지(Synergy) 등의 도메인 데이터를 표현하고
이를 RDB 혹은 Neo4j 구조로 변환할 수 있는 기반을 제공합니다.

---

## Overview

LPDLc는 다음 두 가지 목적을 가집니다.

1. **도메인 기술 언어 (DSL)**
   림버스 컴퍼니의 인격/스킬 데이터를 선언적으로 표현하기 위한 전용 문법을 제공합니다.
   기존 JSON이나 SQL 스크립트보다 가독성과 유지보수성이 높습니다.

2. **컴파일러 및 Exporter**
   작성된 LPDL 파일을 구문 분석(Parsing)하여 AST(Abstract Syntax Tree)을 생성하고,
   이를 RDB 혹은 Neo4j 등 다양한 데이터 스토리지로 변환할 수 있는 확장 가능한 아키텍처를 제공합니다.

---

## Example

```lpdl
persona "홍루 · 3성" {
  sinner "홍루"
  grade 3★
  sin WRATH
  release "2023-05-15"

  resistance {
    slash WEAK,
    pierce NORMAL,
    blunt RESIST
  }

  skill 1 "1번 스킬" {
    category ATTACK
    sin WRATH
    attack PIERCE

    sync SYNC_4 {
      basePower 5
      coinPower 8
      coinCount 3

      effect "출혈 부여" {
        trigger ON_HIT
        target apply BLEED ADD 2 cap 10
      }
    }
  }
}
```

---

## Usage

```java
CharStream input = CharStreams.fromFileName("honglu.lpdl");
LPDLLexer lexer = new LPDLLexer(input);
CommonTokenStream tokens = new CommonTokenStream(lexer);
LPDLParser parser = new LPDLParser(tokens);

ParseTree tree = parser.program();
assert parser.getNumberOfSyntaxErrors() == 0;
```

추후에는 다음과 같은 컴파일 및 변환 API를 제공할 예정입니다.

```java
EidosCompiler compiler = EidosCompiler.fromFile("honglu.lpdl");
compiler.export(ExportType.NEO4J, neo4jSession);
compiler.export(ExportType.RDB, dataSource);
```

---

## Dependencies

* Java 21+
* ANTLR 4.13.1
* JUnit 5 (테스트)
* Neo4j Java Driver (예정)
* HikariCP / JDBC (예정)

---

## Roadmap

* [x] LPDL 문법 정의 (ANTLR 4)
* [x] 파서 및 기본 테스트 구현
* [ ] AST → 도메인 모델 매핑
* [ ] RDB / Neo4j Exporter 추가
* [ ] LLM 기반 LPDL 생성 파이프라인 연결
* [ ] CLI 및 Gradle Plugin 지원

