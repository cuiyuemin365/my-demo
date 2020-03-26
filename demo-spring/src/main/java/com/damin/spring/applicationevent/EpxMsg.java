package com.damin.spring.applicationevent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

/**
 * http://wiki.lianjia.com/pages/viewpage.action?pageId=348853632
 * Epx 消息格式
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EpxMsg implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 变更字段信息
     */
    private Map<String, EpxChanged> changed;
    /**
     * 变更的表中的所有字段值，所有值类型为字符串类型
     */
    private Map<String, String> content;
    /**
     * 数据来源标识
     */
    private String data;
    /**
     * 变更的数据库
     */
    private String database;
    /**
     * 变更事件唯一标识#port#logfilename#binlogpostition#epx-receive-time（ 时间戳，ms）#epx-send-time（
     * 时间戳，ms）
     */
    private String id;
    /**
     * 变更的表
     */
    private String table;
    /**
     * 数据变更时间戳
     */
    private Long timestamp;
    /**
     * 业务数据全链路追踪id，需要回传给检索用于对数据跟踪
     */
    private Long traceId;
    /**
     * binlog 类型INSERT/DELETE/UPDATE
     */
    private String type;

}
