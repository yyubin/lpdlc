package org.yyubin.lpdl.prompt;

public class PromptTemplate {

    public String getSystemPrompt() {
        return """
            당신은 LPDL(Limbus Persona Description Language) 전문가입니다.
            사용자의 자연어 설명을 정확한 LPDL 코드로 변환하는 것이 당신의 임무입니다.

            """ + LPDLGrammarSpec.getFullSpec() + """

            # Few-Shot 예제 (실제 동작하는 코드)

            ## 예제 1
            입력: "홍루 페르소나를 만들어줘. 등급은 3이고, 죄인은 홍루야."
            출력:
            ```lpdl
            persona "홍루" {
              sinner "홍루"
              grade 3
            }
            ```

            ## 예제 2
            입력: "로쟈 페르소나, 등급 2, 스킬 1번은 베기라는 공격 스킬이야. 죄악은 분노고 공격 타입은 참격이야."
            출력:
            ```lpdl
            persona "로쟈" {
              sinner "로쟈"
              grade 2

              skill 1 "베기" {
                category ATTACK
                sin WRATH
                attack SLASH
              }
            }
            ```

            ## 예제 3
            입력: "홍루 페르소나. 등급 3. 체력은 기본 80, 성장률 7.5, disturbed는 30, 50, 70이야. 속도는 최소 3, 최대 5."
            출력:
            persona "홍루" {
              sinner "홍루"
              grade 3

              health {
                base 80,
                growth 7.5,
                disturbed [30, 50, 70]
              }

              speed {
                min 3,
                max 5
              }
            }

            ## 예제 4 (복잡한 스킬 포함)
            입력: "홍루 페르소나를 만들어줘. 등급 3, 최대 레벨 50, 출시일 2023-02-27.
            저항은 참격 보통, 관통 약점, 타격 저항. 속도는 3~5.
            체력은 기본 80, 성장률 7.5, disturbed [30, 50, 70].
            스킬 3번 '오베르튀레'는 공격 스킬이고, 죄악은 분노, 공격타입 관통, 타겟 수 2, 키워드 출혈이야.
            SYNC_4에서 basePower 5, coinPower 8, coinCount 3, weight 1, level 40이야."
            출력:
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

            # 중요 규칙

            1. **오직 LPDL 코드만 출력하세요**. 설명이나 주석은 제거하세요.
            2. **마크다운 코드 블록을 사용하지 마세요**. 순수 LPDL 코드만 출력하세요.
            3. **필수 필드**: persona의 `sinner`와 `grade`는 필수입니다.
            4. **열거형 값**: grade는 1, 2, 3만 가능합니다. 문자열이 아닌 숫자로 작성하세요.
            5. **문자열**: 이름과 문자열 값은 큰따옴표로 감싸세요.
            6. **구조**: 중괄호와 세미콜론 위치를 정확히 지켜주세요.
            7. **쉼표**: 블록 내부의 각 필드는 쉼표로 구분하세요.

            이제 사용자의 요청을 LPDL 코드로 변환해주세요.
            """;
    }

    public String getUserPrompt(String naturalLanguage) {
        return naturalLanguage;
    }

    public String getRegenerationPrompt(String naturalLanguage, String previousLPDL, String errorMessage) {
        return String.format("""
            원본 요청: %s

            이전에 생성한 LPDL:
            ```
            %s
            ```

            하지만 다음 오류가 발생했습니다:
            %s

            위 오류를 수정한 올바른 LPDL 코드를 다시 생성해주세요.
            오직 수정된 LPDL 코드만 출력하고, 설명은 제거하세요.
            """, naturalLanguage, previousLPDL, errorMessage);
    }
}
