package com.wtamu.scotty.kolton.cidm4385.ultimatelifeplanner.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.wtamu.scotty.kolton.cidm4385.ultimatelifeplanner.Plan;
import com.wtamu.scotty.kolton.cidm4385.ultimatelifeplanner.database.PlanDbSchema.PlanTable;

import java.util.Date;
import java.util.UUID;

public class PlanCursorWrapper extends CursorWrapper {

    public PlanCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Plan getPlan() {
        String uuidString = getString(getColumnIndex(PlanTable.Cols.UUID));
        String activity = getString(getColumnIndex(PlanTable.Cols.ACTIVITY));
        long date = getLong(getColumnIndex(PlanTable.Cols.DATE));
        //string location = getInt(getColumnIndex(PlanTable.Cols.LOCATION));

        Plan plan = new Plan(UUID.fromString(uuidString));
        plan.setActivity(activity);
        plan.setDate(new Date(date));
        //plan.setLocation();

        return plan;
    }
}
