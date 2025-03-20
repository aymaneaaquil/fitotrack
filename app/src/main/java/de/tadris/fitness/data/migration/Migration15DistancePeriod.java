/*
 * Copyright (c) 2022 Jannis Scheibe <jannis@tadris.de>
 *
 * This file is part of FitoTrack
 *
 * FitoTrack is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     FitoTrack is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.tadris.fitness.data.migration;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

public class Migration15DistancePeriod extends Migration {

    public Migration15DistancePeriod(Context context, MigrationListener listener) {
        super(context, listener);
    }

    @Override
    public void migrate() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int value = preferences.getInt("spokenUpdateDistancePeriod", 0);
        preferences.edit().putFloat("spokenUpdateDistancePeriod2", (float) value).commit();
    }
}
