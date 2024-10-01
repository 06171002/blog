//package com.blog;
//
//import com.blog.domain.User;
//import org.springframework.web.bind.annotation.*;
//
////요청 => 응답 (HTML 파일) : @Controller
////요청 => 응답 (Data) : @RestController
//@RestController
//public class HttpControllerTest {
//
////인터넷 브라우저 URL 요청은 무조건 get 요청밖에 할 수 없다. => postman 사용 ㄱ
//    // localhost:8080/http/get?id=1&username=test
//    @GetMapping("/http/get")
//    public String getTest(@RequestParam Long id, @RequestParam String username) {
//        return "get 요청" + id + ", " + username;
//    }
//    /* 위처럼 개별적으로 받아오는 것이 아닌, Member Entity 에 매핑시켜서 뭉텅이로 받아옴 (Message Converter)
//       localhost:8080/http/get?id=1&username=test => 단, 엔티티 필드명과 쿼리 스트링 값이 같아야 함 */
//    @GetMapping("/http/get")
//    public String getTest(User m) {
//        return "get 요청" + m.getId() + ", " + m.getUsername();
//    }
//
//
//    /* localhost:8080/http/post : HTTP 메시지 Body 로 데이터 보냄 */
//    //Content-Type: application/x-www-form-urlencoded
//    @PostMapping("/http/post")
//    public String formPostTest(User m) {
//        return "post 요청" + m.getId() + ", " + m.getUsername();
//    }
//    //Content-Type: text/plain
//    @PostMapping("/http/post")
//    public String textPostTest(@RequestBody String text) {
//        return "post 요청" + text;
//    }
//    //Content-Type: application/json
//    @PostMapping("/http/post")
//    public String jsonPostTest(@RequestBody User m) {
//        return "post 요청" + m.getId() + ", " + m.getUsername();
//    }
//
//
//    @PutMapping("/http/put")
//    public String putTest() {
//        return "put 요청";
//    }
//
//
//    @DeleteMapping("/http/delete")
//    public String deleteTest() {
//        return "delete 요청";
//    }
////================================================================================
//    @GetMapping("/http/builder")
//    public String builderTest() {
//        User m = User.builder()
//                .username("홍길동")
//                .email("seyeop03@naver.com")
//                .password("1234")
//                .build();
//        return "builder 패턴";
//    }
//}
