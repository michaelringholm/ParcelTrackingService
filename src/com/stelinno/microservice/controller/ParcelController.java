package com.stelinno.microservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stelinno.microservice.entity.Parcel;

@Controller

@RequestMapping("/parcel")
public class ParcelController {
	
	@RequestMapping("/track")
	public @ResponseBody Parcel trackParcel(String parcelId) {
		Parcel parcel = new Parcel();
		parcel.ParcelId = parcelId;
		return parcel;
	}
}
