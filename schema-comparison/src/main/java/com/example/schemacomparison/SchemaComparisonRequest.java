package com.example.schemacomparison;

public class SchemaComparisonRequest {

	private TableSchema table1;
	private TableSchema table2;
	public SchemaComparisonRequest(TableSchema table1, TableSchema table2) {
		super();
		this.table1 = table1;
		this.table2 = table2;
	}
	public TableSchema getTable1() {
		return table1;
	}
	public void setTable1(TableSchema table1) {
		this.table1 = table1;
	}
	public TableSchema getTable2() {
		return table2;
	}
	public void setTable2(TableSchema table2) {
		this.table2 = table2;
	}
}
