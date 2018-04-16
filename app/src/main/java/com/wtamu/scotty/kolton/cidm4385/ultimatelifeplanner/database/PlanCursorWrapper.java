package com.wtamu.scotty.kolton.cidm4385.ultimatelifeplanner.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.wtamu.scotty.kolton.cidm4385.ultimatelifeplanner.Plan;
import com.wtamu.scotty.kolton.cidm4385.ultimatelifeplanner.database.PlanDbSchema.PlanTable;
import com.wtamu.scotty.kolton.cidm4385.ultimatelifeplanner.database.PlanDbSchema.DateTable;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

public class PlanCursorWrapper extends CursorWrapper {

    public PlanCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Plan getPlan() {
        String uuidString = getString(getColumnIndex(PlanTable.Cols.UUID));
        String activity = getString(getColumnIndex(PlanTable.Cols.ACTIVITY));
        String location = getString(getColumnIndex(PlanTable.Cols.LOCATION));

        long date = getLong(getColumnIndex(DateTable.Cols.DATE));
        long time = getLong(getColumnIndex(DateTable.Cols.TIME));

        Plan plan = new Plan(UUID.fromString(uuidString));
        plan.setActivity(activity);
        plan.setDate(new Date(date));
        plan.setLocation(location);
        plan.setTime(new Time(time));
        return plan;
    }
}
