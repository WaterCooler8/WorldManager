package org.test.worldManager;

public class SpecificPosition {
    int SpecificTableEntryId = 0;
    String SpecificTableName = "meta";

    public int getSpecificTableEntryId() {
        return SpecificTableEntryId;
    }

    public String getSpecificTableName() {
        return SpecificTableName;
    }

    public void setSpecificTableEntryId(int specificTableEntryId) {
        SpecificTableEntryId = specificTableEntryId;
    }

    public void setSpecificTableName(String specificTableName) {
        SpecificTableName = specificTableName;
    }

    public void setPosition(int inputId,String inputTableName){ SpecificTableEntryId = inputId;SpecificTableName = inputTableName;}






}
