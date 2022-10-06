package com.kim.FileUpload2.controller;

import org.springframework.stereotype.Controller;

import com.kim.FileUpload2.storage.StorageService;

@Controller
@AllArgsConstructor(onConstructor=@__(@Autowired))
public class FileUploadController {
	private StorageService storageService;

}
