package org.yyubin.lpdl.exporter.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 테이블별 ID 자동 증가 관리
 *
 * RDB의 AUTO_INCREMENT를 시뮬레이션하여
 * 각 테이블마다 독립적인 ID 시퀀스를 관리합니다.
 */
public class IDManager {
    private final Map<String, AtomicLong> counters;

    public IDManager() {
        this.counters = new HashMap<>();
    }

    /**
     * 다음 ID 반환 (1부터 시작)
     *
     * @param table 테이블 이름
     * @return 자동 증가된 ID
     */
    public long nextId(String table) {
        return counters
            .computeIfAbsent(table, k -> new AtomicLong(0))
            .incrementAndGet();
    }

    /**
     * 특정 테이블의 현재 ID 값 조회 (증가 없이)
     */
    public long getCurrentId(String table) {
        AtomicLong counter = counters.get(table);
        return counter != null ? counter.get() : 0;
    }

    /**
     * 특정 테이블의 ID 카운터 리셋
     */
    public void resetTable(String table) {
        counters.remove(table);
    }

    /**
     * 모든 ID 카운터 리셋
     */
    public void resetAll() {
        counters.clear();
    }

    /**
     * 관리 중인 테이블 개수
     */
    public int getTableCount() {
        return counters.size();
    }
}
