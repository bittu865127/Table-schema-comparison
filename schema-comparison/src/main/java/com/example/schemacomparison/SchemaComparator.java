package com.example.schemacomparison;

import java.util.List;

public class SchemaComparator {

    public static String compareSchemas(TableSchema table1, TableSchema table2) {
        StringBuilder difference = new StringBuilder();

        List<TableSchema.Column> columns1 = table1.getColumns();
        List<TableSchema.Column> columns2 = table2.getColumns();

        // Compare column names and data types
        for (TableSchema.Column column1 : columns1) {
            boolean found = false;

            for (TableSchema.Column column2 : columns2) {
                if (column1.getColumnName().equals(column2.getColumnName())) {
                    found = true;

                    if (!column1.getDataType().equals(column2.getDataType())) {
                        difference.append("Column '")
                                  .append(column1.getColumnName())
                                  .append("' has different data types: ")
                                  .append(column1.getDataType())
                                  .append(" and ")
                                  .append(column2.getDataType())
                                  .append("\n");
                    }

                    // You might want to add more checks here based on your requirements

                    break;
                }
            }

            if (!found) {
                difference.append("Column '")
                          .append(column1.getColumnName())
                          .append("' is present in the first table but not in the second table\n");
            }
        }

        // Check for columns present in table2 but not in table1
        for (TableSchema.Column column2 : columns2) {
            boolean found = false;

            for (TableSchema.Column column1 : columns1) {
                if (column2.getColumnName().equals(column1.getColumnName())) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                difference.append("Column '")
                          .append(column2.getColumnName())
                          .append("' is present in the second table but not in the first table\n");
            }
        }

        return difference.toString();
    }
}
