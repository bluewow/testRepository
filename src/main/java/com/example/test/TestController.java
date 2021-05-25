package com.example.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Api(tags = {"테스트 컨트롤러"})
@RequiredArgsConstructor
@RestController
public class TestController {
    private final TestService testService;

    @ApiOperation("테스트")
    @GetMapping("/test")
    public String test() throws InterruptedException {
        testService.test();
        return "test";
    }

    @ApiOperation("테스트1")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "TEST", value = "테스트", required = true)
    })
    @GetMapping("/test/get")
    public String test1(String TEST) {
        return "test1";
    }

    @ApiOperation("테스트2")
    @PostMapping("/test/post")
    public Test test2(@RequestBody Test map) throws InterruptedException {
        return map;
    }

    @ApiOperation("테스트3")
    @GetMapping("/test/return/object")
    public Test test3() {
        Test test = new Test("a", "b");
        return test;
    }

    @GetMapping("/test/response")
    public List<UserVo> test4() {
        List<UserVo> userVoList = IntStream.range(0, 10)
                .mapToObj(i -> new UserVo("userId", "test"))
                .collect(Collectors.toList());

        return userVoList;
    }
}
