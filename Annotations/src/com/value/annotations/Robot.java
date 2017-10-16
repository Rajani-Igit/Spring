package com.value.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("robot")
public class Robot {
	@Value("#{approbot.robot_id}")
	private int id;
	@Value("#{approbot.robot_id}")
	private String type;
	@Autowired
	private Chip chip;
	@Override
	public String toString() {
		return "Robot [id=" + id + ", type=" + type + ", chip=" + chip + "]";
	}
	

}
