/**
 *Copyright (C) 2013  Wikimedia Foundation
 *
 *This program is free software; you can redistribute it and/or
 *modify it under the terms of the GNU General Public License
 *as published by the Free Software Foundation; either version 2
 *of the License, or (at your option) any later version.
 *
 *This program is distributed in the hope that it will be useful,
 *but WITHOUT ANY WARRANTY; without even the implied warranty of
 *MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License
 *along with this program; if not, write to the Free Software
 *Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

 */
package org.wikimedia.analytics.varnishkafka;


import java.util.*;

public class Results {


    private String format;

    private List<Double> linesPerSec = new ArrayList<Double>();

    private List<Double> timeElapsed = new ArrayList<Double>();

    private boolean compressed;

    private long fileSize;


    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<Double> getLinesPerSec() {
        return linesPerSec;
    }

    public void setLinesPerSec(double linesPerSec) {
        this.linesPerSec.add(linesPerSec);
    }

    public List<Double> getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(double timeElapsed) {
        this.timeElapsed.add(timeElapsed);
    }

    public boolean isCompressed() {
        return compressed;
    }

    public void setCompressed(boolean compressed) {
        this.compressed = compressed;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public double getAverageTimeElapsed() {
       double sum = 0.0;
       Iterator it = getTimeElapsed().listIterator();
       while (it.hasNext()) {
           sum += (Double) it.next();
       }
        return sum / getTimeElapsed().size();
    }

//    public double minTimeElapsed() {
//
//    }
//
//    public double maxTimeElapsed() {
//        Collections.sort(getTimeElapsed());
//    }
}
