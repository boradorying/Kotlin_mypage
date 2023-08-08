# **나만의 로그인 페이지 만들어서 나를 소개하기💨**

## **프로젝트 소개 ❗❕❗**

이 프로젝트는 **SignIn**, **SignUp**, 그리고 **Home** 세 가지 화면으로 구성된 어플리케이션입니다. 이 어플리케이션을 통해 나를 소개하고 로그인을 통해 나만의 정보를 확인할 수 있습니다~~.

## **✅화면 구성**

### **1️⃣SignIn 화면**
![2](https://github.com/boradorying/Kotlin_mypage/assets/136980408/2dd222c6-c90b-437e-b85c-9f32972811c8)

로그인 화면은 앱을 실행했을 때 처음 나타나는 화면입니다. 이미지뷰, 텍스트뷰, 에딧뷰로 구성되어 있으며, 사용자는 여기서 자신의 아이디와 비밀번호를 입력하여 로그인할 수 있습니다.
또한 아이디와 비밀번호중 한개라도 입력이 안되어 있는 경우 토스트메시지를 띄워서 "아이디/비밀번호를 입력해주세요" 라고 빈칸이 있을 시 로그인을 할 수 없는 로직을 구현하였습니다.

### **2️⃣SignUp 화면**

![1](https://github.com/boradorying/Kotlin_mypage/assets/136980408/dec5f4ab-eeb8-4e44-8f57-986a8047924c)

회원가입을 위한 화면으로, 여기서 입력한 아이디와 비밀번호는 SignIn 화면으로 정보가 전달되어 별도의 입력 없이 로그인이 가능합니다. 또한 이미지뷰, 텍스트뷰, 에딧뷰로 구성되어  되어있습니다.
여기또한 마찬가지 아이디,비밀번호,이름중 한개라도 빈칸이 있는경우  "입력되지 않은 정보가 있습니다"라는 토스트메시지를 띄워주는 로직을 구현하였습니다.

### **3️⃣Home 화면**
![3](https://github.com/boradorying/Kotlin_mypage/assets/136980408/f66e9093-ad3a-42e0-a332-0ff17a1ddd29)
![4](https://github.com/boradorying/Kotlin_mypage/assets/136980408/7666324b-7e0a-428b-958e-17a41e66b5ac)
![5](https://github.com/boradorying/Kotlin_mypage/assets/136980408/ce238868-f6f7-4c5d-b144-155b74600a4b)



나를 소개하는 화면으로, 로그인 후 랜덤 이미지가 이미지뷰에 표시됩니다. 종료 버튼을 누를 경우 selector를 활용하여 배경, 둥근 모서리, 아이콘 등에 변화를 주었습니다.
SignIn 화면에서 입력한 아이디를 받아와서 텍스트뷰에 아이디: SignIn에서 입력한 아이디 를 화면에 표시할 수 있게 로직을 구현하였습니다

## **🔸특징🔸**

- 구분이 쉬운 디자인으로 구성된 SignIn, SignUp, Home 화면
- 로그인 정보를 공유하여 편리한 로그인 절차
- 랜덤이미지 표시로 다양한 이미지 표시 가능
- 종료버튼 클릭시 seletor를 이용한 깜찍하고 귀여운 이모티콘 표시

## **🔹마무리🔹**

나만의 로그인 페이지를 만들어서 나를 소개하는 이 프로젝트는 간단하지만 기본적인 레이아웃 사용법 배치 문법등을 익힐 수 있어서 유익한 프로젝트였습니다. 
