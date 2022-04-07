package com.example.SpringBoot_demo.api;


import com.example.SpringBoot_demo.api.output.NewOutput;
import com.example.SpringBoot_demo.dto.NewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import com.example.SpringBoot_demo.service.INewService;

import java.util.List;

@CrossOrigin
@RestController
public class NewAPI {

    @Autowired
    private INewService newService;


    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model) {
        return newService.save(model);
    }

    @PutMapping(value = "/new/{id}")
    public NewDTO updateNew(@RequestBody NewDTO model, @PathVariable("id") Long id) {
        model.setId(id);
        return newService.save(model);
    }

    @GetMapping(value = "/new")
    public NewOutput showNew(@RequestParam("page") int page,
                             @RequestParam("limit") int limit) {
        NewOutput result = new NewOutput();
        result.setPage(page);
        Pageable pageable = PageRequest.of(page - 1 , limit);
        result.setListResult(newService.findAll(pageable));
        result.setTotalPage((int) Math.ceil((double) (newService.totalItem()) / limit));
        return result;
    }

    @GetMapping(value = "/new/search")
    public List<NewDTO> searchNew(@RequestParam("keyword") String keyword) {
        List<NewDTO> result = newService.findAll(keyword);

        return result;
    }

}
