let index = {
		init: function(){
			$("#btn-save").on("click", ()=>{ // function(){} , ()=>{} this를 바인딩하기 위해서!!
				this.save();
			});
			$("#btn-update").on("click", ()=>{ // function(){} , ()=>{} this를 바인딩하기 위해서!!
				this.update();
			});
		},

		save: function(){
//			alert('user 의 save 함수 호출됨');
			let data = {
					username: $("#username").val(),
					password: $("#password").val(),
					email: $("#email").val()
			};

			console.log(data);

			// ajax 호출시 default 가 비동기 호출
			// ajax 통신을 이용해서 3개의 데이터를 json 으로 변경하여 insert 요청!!
			// ajax 가 통신을 성공하고 서버가 json 을 리턴해주면 자동으로 자바 오브젝트로 변환해주네요.
			$.ajax({
				type: "POST",
				url: "/api/auth/sign-up",
				data: JSON.stringify(data), // http body 데이터
				contentType: "application/json; charset=utf-8",// body 데이터가 어떤 타입인지(MIME)
				dataType: "json" // 요청을 서버로해서 응답이 왔을 때 기본적으로 모든 것이 문자열 (생긴게 json 이라면) => javascript 오브젝트로 변경
			}).done(function(resp){
				if(resp.status === 500){
					alert("회원가입에 실패하였습니다.");
				}else{
					alert("회원가입이 완료되었습니다.");
					location.href = "/";
				}

			}).fail(function(error){
			    console.log(JSON.stringify(error));
				alert(JSON.stringify(error));
			});

		},

		update: function(){
			//alert('user 의 save 함수 호출됨');
			let data = {
					id: $("#id").val(),
					username: $("#username").val(),
					password: $("#password").val(),
					email: $("#email").val()
			};

			$.ajax({
				type: "PUT",
				url: "/api/user",
				data: JSON.stringify(data), // http body 데이터
				contentType: "application/json; charset=utf-8",// body 데이터가 어떤 타입인지(MIME)
				dataType: "json" // 요청을 서버로해서 응답이 왔을 때 기본적으로 모든 것이 문자열 (생긴게 json 이라면) => javascript 오브젝트로 변경
			}).done(function(resp){
				alert("회원수정이 완료되었습니다.");
				//console.log(resp);
				location.href = "/";
			}).fail(function(error){
				alert(JSON.stringify(error));
			});

		},
}

index.init();