package com.example.demo.payloads;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * MachinePayload is used to define Machine Initial Settings
 */
@Getter
@Setter
public class MachinePayload {

    private Map<String, Integer> outlets;

    private Map<String, Integer> total_items_quantity;

    private Map<String, Map<String, Integer>> beverages;
}
