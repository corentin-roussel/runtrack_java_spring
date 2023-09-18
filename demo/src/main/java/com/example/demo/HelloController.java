@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Hello World !";
    }
}