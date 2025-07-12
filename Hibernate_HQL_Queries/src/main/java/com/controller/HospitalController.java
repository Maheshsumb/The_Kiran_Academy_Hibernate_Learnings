package com.controller;

import com.service.HospitalService;

public class HospitalController {
	public static void main(String[] args) {

		HospitalService hs = new HospitalService();
		hs.displaySpecificData();
	}
}
