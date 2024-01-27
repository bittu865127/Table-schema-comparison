package com.example.schemacomparison;

import java.util.List;

public class TableSchema {
    public String tableName;
    public List<Column> columns;

	// Constructors, getters, setters
    public TableSchema(String tableName, List<Column> columns) {
		super();
		this.tableName = tableName;
		this.columns = columns;
	}

    public TableSchema() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}
	
	@Override
	public String toString() {
		return "TableSchema [tableName=" + tableName + ", columns=" + columns + "]";
	}

	// Inner class representing a column
    public static class Column {
        public String columnName;
        public String dataType;
		
        // Constructors, getters, setters
        public Column(String columnName, String dataType) {
			super();
			this.columnName = columnName;
			this.dataType = dataType;
		}

		public String getColumnName() {
			return columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getDataType() {
			return dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		@Override
		public String toString() {
			return "Column [columnName=" + columnName + ", dataType=" + dataType + "]";
		}
    }
}
