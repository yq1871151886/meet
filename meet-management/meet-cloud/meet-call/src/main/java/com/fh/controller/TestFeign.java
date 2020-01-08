package com.fh.controller;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "meet-organization")
public interface TestFeign {
}
