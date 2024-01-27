package com.example.schemacomparison.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.schemacomparison.SchemaComparator;
import com.example.schemacomparison.SchemaComparisonRequest;

@RestController
@RequestMapping("/api")
public class SchemaDifferenceController {

	@PostMapping("/schema/difference")
	public ResponseEntity<String> getSchemaDifference(@RequestBody SchemaComparisonRequest request) {
		String difference = SchemaComparator.compareSchemas(request.getTable1(), request.getTable2());
		return ResponseEntity.ok(difference);
	}
}
