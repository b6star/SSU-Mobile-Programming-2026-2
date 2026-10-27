# 08주차 실습 — 액티비티 전환 다루기

## 실습

명시적 인텐트와 암시적 인텐트로 액티비티를 전환하고, 화면 간 데이터 전달과 결과 반환을 실습한다.

## 구현 내용

| 모듈 | 예제 | 구현 내용 |
| --- | --- | --- |
| [mp0601](./mp0601/) | 6-1 | 스플래시 화면에서 2초 후 로그인 화면으로 이동하고 입력한 로그인 정보를 Toast로 출력 |
| [mp0602](./mp0602/) | 6-2 | 선택한 고양이 또는 강아지 그림을 게임 화면에 전달하고, 틀린 부분 5개를 찾아 정답 여부와 완료 메시지를 Toast로 출력 |
| [mp0603](./mp0603/) | 6-3 | 선택한 도형을 게임 화면에 전달하고, 최대 3개의 그림을 선택한 결과를 첫 화면으로 반환하여 그림과 정답 여부 표시 |
| [mp0604](./mp0604/) | 6-4 | 암시적 인텐트로 웹 브라우저를 실행하여 입력한 웹 주소로 이동 |

## 실습 파일 바로가기

### mp0601 (예제 6-1)

- [MainActivity.kt](./mp0601/src/main/java/com/example/mp0601/MainActivity.kt)
- [LoginActivity.kt](./mp0601/src/main/java/com/example/mp0601/LoginActivity.kt)
- [activity_main.xml](./mp0601/src/main/res/layout/activity_main.xml)
- [activity_login.xml](./mp0601/src/main/res/layout/activity_login.xml)
- [drawable 이미지 폴더](./mp0601/src/main/res/drawable/)

### mp0602 (예제 6-2)

- [MainActivity.kt](./mp0602/src/main/java/com/example/mp0602/MainActivity.kt)
- [GameActivity.kt](./mp0602/src/main/java/com/example/mp0602/GameActivity.kt)
- [activity_main.xml](./mp0602/src/main/res/layout/activity_main.xml)
- [activity_game.xml](./mp0602/src/main/res/layout/activity_game.xml)
- [drawable 이미지 폴더](./mp0602/src/main/res/drawable/)

### mp0603 (예제 6-3)

- [MainActivity.kt](./mp0603/src/main/java/com/example/mp0603/MainActivity.kt)
- [GameActivity.kt](./mp0603/src/main/java/com/example/mp0603/GameActivity.kt)
- [activity_main.xml](./mp0603/src/main/res/layout/activity_main.xml)
- [activity_game.xml](./mp0603/src/main/res/layout/activity_game.xml)
- [drawable 이미지 폴더](./mp0603/src/main/res/drawable/)

### mp0604 (예제 6-4)

- [MainActivity.kt](./mp0604/src/main/java/com/example/mp0604/MainActivity.kt)
- [activity_main.xml](./mp0604/src/main/res/layout/activity_main.xml)
