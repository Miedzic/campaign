package com.miedzic.campaign.controller;

import com.miedzic.campaign.domain.dao.Town;
import com.miedzic.campaign.domain.dto.TownDto;
import com.miedzic.campaign.mapper.TownMapper;
import com.miedzic.campaign.service.TownService;
import com.miedzic.campaign.validator.group.Create;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/towns")
@RequiredArgsConstructor
@Validated
public class TownController {
    private final TownService townService;
    private final TownMapper townMapper;

    @PostMapping
    @Validated(Create.class)
    public TownDto saveTown(@RequestBody @Valid TownDto town) {
        return townMapper.townToTownDto(townService.save(townMapper.townDtoToTown(town)));
    }

    @DeleteMapping("/{id}")
    public void deleteTownById(@PathVariable Long id) {
        townService.deleteById(id);
    }

    @PutMapping("/{id}")
    public TownDto updateTown(@RequestBody TownDto town, @PathVariable Long id) {
        return townMapper.townToTownDto(townService.update(townMapper.townDtoToTown(town), id));
    }

    @GetMapping
    public Page<Town> getTownPage(@RequestParam int page, @RequestParam int size) {
        return townService.getPage(PageRequest.of(page, size));
    }
}
