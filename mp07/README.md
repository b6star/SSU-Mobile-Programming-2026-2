# 09주차 실습 — 메뉴와 앱 바 다루기

## 실습

옵션 메뉴, 컨텍스트 메뉴, 팝업 메뉴의 이벤트를 처리하고, 액션 바와 툴 바에 클릭 횟수 및 정답/오답 횟수를 표시한다.

## 구현 내용

| 모듈 | 예제 | 구현 내용 |
| --- | --- | --- |
| [mp0701](./mp0701/) | 7-1 | 옵션 메뉴로 더하기, 빼기, 곱하기, 나머지 구하기를 선택하고 빈칸에 들어갈 숫자의 정답 여부를 Toast로 출력 |
| [mp0702](./mp0702/) | 7-2 | 컨텍스트 메뉴로 고양이와 강아지의 수를 비교하는 기호를 선택하고 정답 여부를 Toast로 출력 |
| [mp0703](./mp0703/) | 7-3 | 팝업 메뉴로 동물 그림을 크기순으로 오름차순 또는 내림차순 정렬하고 정렬 방식을 Toast로 출력 |
| [mp0704](./mp0704/) | 7-4 | 찬성/반대 버튼의 클릭 횟수를 액션 바에 표시하고 메뉴로 횟수 초기화 및 앱 종료 |
| [mp0705](./mp0705/) | 7-5 | 과일 개수 연산의 정답/오답 횟수를 툴 바에 표시하고 새 문제 출제, 횟수 초기화 및 앱 종료 |

## 실습 파일 바로가기

### mp0701 (예제 7-1)

- [MainActivity.kt](./mp0701/src/main/java/com/example/mp0701/MainActivity.kt)
- [activity_main.xml](./mp0701/src/main/res/layout/activity_main.xml)
- [option_menu.xml](./mp0701/src/main/res/menu/option_menu.xml)
- [drawable 이미지 폴더](./mp0701/src/main/res/drawable/)

### mp0702 (예제 7-2)

- [MainActivity.kt](./mp0702/src/main/java/com/example/mp0702/MainActivity.kt)
- [activity_main.xml](./mp0702/src/main/res/layout/activity_main.xml)
- [cat_menu.xml](./mp0702/src/main/res/menu/cat_menu.xml)
- [dog_menu.xml](./mp0702/src/main/res/menu/dog_menu.xml)
- [drawable 이미지 폴더](./mp0702/src/main/res/drawable/)

### mp0703 (예제 7-3)

- [MainActivity.kt](./mp0703/src/main/java/com/example/mp0703/MainActivity.kt)
- [activity_main.xml](./mp0703/src/main/res/layout/activity_main.xml)
- [menu.xml](./mp0703/src/main/res/menu/menu.xml)
- [drawable 이미지 폴더](./mp0703/src/main/res/drawable/)

### mp0704 (예제 7-4)

- [MainActivity.kt](./mp0704/src/main/java/com/example/mp0704/MainActivity.kt)
- [activity_main.xml](./mp0704/src/main/res/layout/activity_main.xml)
- [ok_layout.xml](./mp0704/src/main/res/layout/ok_layout.xml)
- [no_layout.xml](./mp0704/src/main/res/layout/no_layout.xml)
- [menu.xml](./mp0704/src/main/res/menu/menu.xml)
- [drawable 이미지 폴더](./mp0704/src/main/res/drawable/)

### mp0705 (예제 7-5)

- [MainActivity.kt](./mp0705/src/main/java/com/example/mp0705/MainActivity.kt)
- [activity_main.xml](./mp0705/src/main/res/layout/activity_main.xml)
- [yes_layout.xml](./mp0705/src/main/res/layout/yes_layout.xml)
- [no_layout.xml](./mp0705/src/main/res/layout/no_layout.xml)
- [menu.xml](./mp0705/src/main/res/menu/menu.xml)
- [drawable 이미지 폴더](./mp0705/src/main/res/drawable/)
