package com.example.SpringBoot_demo.api.output;

import com.example.SpringBoot_demo.dto.NewDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class NewOutput {

    private int page;
    private int totalPage;
    private List<NewDTO> listResult = new ArrayList<>();

}
