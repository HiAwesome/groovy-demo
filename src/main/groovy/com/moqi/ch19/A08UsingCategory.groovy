package com.moqi.ch19

/**
 * 分类与 DSL 1
 *
 * @author moqi On 10/28/20 10:19
 */
class A08DateUtil {
    static int getDays(Integer self) {
        self
    }

    static Calendar getAgo(Integer self) {
        def date = Calendar.instance
        date.add(Calendar.DAY_OF_MONTH, -self)
        date
    }

    static Date at(Calendar self, Double time) {
        def hour = (int)(time.doubleValue())
        def minute = (int)(Math.round((time.doubleValue() - hour) * 100))
        self.set(Calendar.HOUR_OF_DAY, hour)
        self.set(Calendar.MINUTE, minute)
        self.set(Calendar.SECOND, 0)
        self.time
    }
}

use(A08DateUtil) {
    println 2.days.ago.at(4.30)
}

