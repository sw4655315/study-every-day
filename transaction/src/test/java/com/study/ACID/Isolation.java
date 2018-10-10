package com.study.ACID;


/**
 * 事务 - 隔离性
 * 数据库允许多个并发事务同时对其数据进行读写和修改的能力，隔离性可以防止多个事务并发执
 * 行时由于交叉执行而导致数据的不一致。
 * 事务隔离分为不同级别，包括
 *  读未提交（ Read uncommitted）//最低级别
 *  读提交（read committed）
 *  可重复读（repeatable read）
 *  串行化（Serializable） // 最高级别
 *
 *  个人理解:
 *  1. 事务隔离是在多个事务之间发生
 *  2. 集群事务(?) mysql集群
 * @author jisong.sun on 2018/10/9.
 */
public class Isolation {

}
