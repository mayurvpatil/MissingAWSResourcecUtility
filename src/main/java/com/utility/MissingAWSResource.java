package com.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MissingAWSResource {

	public void findMissingAWSResources(String deployNowJsonPath, String testNowRbFilePath) throws IOException {

		List<DNResource> dnowResources = getDNResourceList(deployNowJsonPath);

		List<String> testNowResources = getTestaNowResourceList(testNowRbFilePath);
		
		List<DNResource> missingResources = getMissingResources(dnowResources, testNowResources);
		
		System.out.println("Missing resources count = " + ( dnowResources.size() - testNowResources.size() ) + "\n");
		
		for (DNResource dnResource : missingResources) {
			System.out.println(dnResource.getName());
		}
	}

	public List<DNResource> getMissingResources(List<DNResource> dnowResources, List<String> testNowResources) {
		
		List<DNResource> misisngResources = new ArrayList<DNResource>();
		
		for(DNResource dnResource : dnowResources) {
			if(!testNowResources.contains(dnResource.getName())) {
				misisngResources.add(dnResource);
			}
		}
		
		return misisngResources;
	}

	public List<String> getTestaNowResourceList(String testNowRbFilePath) throws IOException {

		List<String> resourceList = new ArrayList<String>();

		BufferedReader reader = new BufferedReader(new FileReader(testNowRbFilePath));

		String line = reader.readLine();
		while (line != null) {
			line = line.trim();
			
			if (!line.isEmpty() && !line.startsWith("#") && !line.startsWith("module") && !line.startsWith("end") ) {
				//System.out.println(line);
				resourceList.add(line.substring(line.indexOf("\"") + 1, line.lastIndexOf("\"")));
			}
			
			line = reader.readLine();
			
		}
		reader.close();

		return resourceList;
	}

	public List<DNResource> getDNResourceList(String json_string_path) throws IOException {

		byte[] jsonString = Files.readAllBytes(Paths.get(json_string_path));
		ObjectMapper objectMapper = new ObjectMapper();

		return objectMapper.readValue(jsonString, new TypeReference<List<DNResource>>() {
		});

	}

	public static void main(String[] args) throws IOException {
		
		String deployNowJsonPath = args[0];
		String testNowRbFilePath = args[1];

		MissingAWSResource missingAWSResource = new MissingAWSResource();
		missingAWSResource.findMissingAWSResources(deployNowJsonPath, testNowRbFilePath);

	}
}
