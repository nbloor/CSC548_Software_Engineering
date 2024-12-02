package com.ltp.workbook.controller;

public class showsController {
    
    @GetMapping("/")
    public String getShows(){
        return "shows";
    }
}
