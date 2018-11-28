package com.eevoe.demo1.controller;

import com.eevoe.demo1.Res;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "home", tags = "首页接口",description="首页说明")
public class IndexController {
    private int count = 0;

    @GetMapping("/")
    @ApiOperation(value = "test", notes = "首页测试")
    @ApiImplicitParams({})
    @ApiResponse(response = Res.class, code = 200, message = "返回数据")
    public Res greeting() {
        count += 1;
        return new Res<>(count);
    }
}