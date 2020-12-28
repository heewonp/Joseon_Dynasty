# 멀티캠퍼스 딥러닝기반 AI엔지니어링 프로젝트-2

## 조선 왕조실록을 통한 왕별 특징

### 조선에 당도한 것을 환영하오, 낮선이오 조

> 왕별로 공통키워드를 뽑은 뒤 (`백성`) 결과 값을 LDA모델링, 연관규칙을 이용하여 단어 네트워크 그래프
>
> 키워드에 따른 단어들을 보고 왕들의 태도나 시대를 엿볼 수 있음
>
> 결과물들은 간단하게 웹사이트로 구축함

### 사용 언어 및 툴:

> 사용 언어 : Python3,JAVA11,Javascript,HTML
>
> 개발 툴 : jupyter notebook,vscode
>
> 사용 프레임워크 : spring boot



### 임무분담

1. 조선왕조실록 데이터 크롤링 : 노용철, 박희원
2. 논문 및 자료 조사 : 조유정
3. 키워드 산출 및 LDA : 노용철, 이학민, 조유정, 박희원
4. network 그래프 산출 : 박희원
5. RNN 모델링 : 노용철
6. 웹서비스 제작( bootstrap ) : 박희원

### 진행 과정

1. 조선왕조실록 홈페이지 크롤링
2. 각 왕별로 `백성` 이 포함된 날짜만 추출
3. 2번의 결과값을 단어로 쪼개기
4. LDA 모델링 및 단어 네트워킹 그래프

### 대표로 진행한 왕(조선 전기/중기/후기/근대으로 나눔)

#### 1. 조선 초기(태조,세종,중종)

- 태조(백성)
  - 제도,종묘, 도평의사사

![image](https://user-images.githubusercontent.com/59459751/98788191-db902d80-2443-11eb-8494-38699447719c.png)

- 세종(백성)
  - 의논,하늘

![image](https://user-images.githubusercontent.com/59459751/98788291-024e6400-2444-11eb-9f9d-6fed82f1a352.png)

- 중종(백성)
  - 평안도, 간도, 함경도

![image](https://user-images.githubusercontent.com/59459751/98788371-227e2300-2444-11eb-8bca-fe3ef84aaaa3.png)

#### 2. 조선 중기(선조,숙종)

- 선조(백성)
  - 왜적,폐단,유성룡

![image](https://user-images.githubusercontent.com/59459751/98788492-50636780-2444-11eb-8863-2f4edb1ee264.png)

![image](https://user-images.githubusercontent.com/59459751/98788522-59eccf80-2444-11eb-9219-a16c91867c38.png)

> SimRNN모델을 통하여 선조가 백성들에게 했던 말을 생성함.

- 숙종(백성)
  - 호포

![image](https://user-images.githubusercontent.com/59459751/98788665-94ef0300-2444-11eb-8d6b-1b4367f9f3d7.png)

#### 3. 조선 후기(영조,순조)

- 영조(백성)
  - 폐단,고을,수령

![image](https://user-images.githubusercontent.com/59459751/98788847-c8ca2880-2444-11eb-8afd-baec9974aad6.png)

- 순조(백성)
  - 폐단,고을,수령

![image](https://user-images.githubusercontent.com/59459751/98788945-e7302400-2444-11eb-9767-2323d7107b01.png)

#### 4. 조선 근대(고종,순종)

- 고종(백성)
  - 개국,광무,화물,양력,일본

![image](https://user-images.githubusercontent.com/59459751/98789032-0b8c0080-2445-11eb-8622-4de8af8acecf.png)

- 순종(백성)
  - 일본,청국,협약,황후

![image](https://user-images.githubusercontent.com/59459751/98789107-2b232900-2445-11eb-800a-e598e9842835.png)

### 웹서비스(UI는 bootstrap사용)

#### 메인페이지

![main](https://user-images.githubusercontent.com/59459751/98789159-455d0700-2445-11eb-8b52-c28027bef6df.PNG)

> 화면 상단 우측에 프로젝트 git사이트, ect 조선왕조실록 사이트로 이동
>
> 누가 가장 백성을 가장 많이 언급했는지 차트로 나타냄

### LDA페이지

![lda](https://user-images.githubusercontent.com/59459751/98789350-85bc8500-2445-11eb-8170-eb76c9ca9ab1.PNG)

> 왕/키워드 별로 LDA모델링한 HTML파일을 볼 수 있음 마지막 lda 컬럼에 차트 아이콘 클릭시 이동

![lda2](https://user-images.githubusercontent.com/59459751/98789444-a389ea00-2445-11eb-97cb-2b06fecc3348.PNG)

> 테이블 내용 검색가능

#### keyword

![keyword](https://user-images.githubusercontent.com/59459751/98789504-b69cba00-2445-11eb-9240-60dc2e424c4a.PNG)

> 왕별로 검색한 키워드와 그에 관련된 연관단어 popover로 표현

#### chart

![chart](https://user-images.githubusercontent.com/59459751/98789561-cd431100-2445-11eb-830a-dcc3c824bccd.PNG)
