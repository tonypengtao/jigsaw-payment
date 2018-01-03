// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity.proto

package org.jigsaw.payment.member;

public interface ChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Channel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *自动增量，主键
   * </pre>
   *
   * <code>optional int64 key = 1;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   *自动增量，主键
   * </pre>
   *
   * <code>optional int64 key = 1;</code>
   */
  long getKey();

  /**
   * <pre>
   *编号，对外的ID    
   * </pre>
   *
   * <code>optional int64 id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   *编号，对外的ID    
   * </pre>
   *
   * <code>optional int64 id = 2;</code>
   */
  long getId();

  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>optional int64 create_time = 3 [(.column_option) = { ... }</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>optional int64 create_time = 3 [(.column_option) = { ... }</code>
   */
  long getCreateTime();

  /**
   * <pre>
   *创建用户姓名
   * </pre>
   *
   * <code>optional string create_user = 4;</code>
   */
  boolean hasCreateUser();
  /**
   * <pre>
   *创建用户姓名
   * </pre>
   *
   * <code>optional string create_user = 4;</code>
   */
  java.lang.String getCreateUser();
  /**
   * <pre>
   *创建用户姓名
   * </pre>
   *
   * <code>optional string create_user = 4;</code>
   */
  com.google.protobuf.ByteString
      getCreateUserBytes();

  /**
   * <pre>
   *更新时间
   * </pre>
   *
   * <code>optional int64 update_time = 5 [(.column_option) = { ... }</code>
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   *更新时间
   * </pre>
   *
   * <code>optional int64 update_time = 5 [(.column_option) = { ... }</code>
   */
  long getUpdateTime();

  /**
   * <pre>
   *更新用户姓名
   * </pre>
   *
   * <code>optional string update_user = 6;</code>
   */
  boolean hasUpdateUser();
  /**
   * <pre>
   *更新用户姓名
   * </pre>
   *
   * <code>optional string update_user = 6;</code>
   */
  java.lang.String getUpdateUser();
  /**
   * <pre>
   *更新用户姓名
   * </pre>
   *
   * <code>optional string update_user = 6;</code>
   */
  com.google.protobuf.ByteString
      getUpdateUserBytes();

  /**
   * <pre>
   *状态:1有效2无效
   * </pre>
   *
   * <code>optional int32 status = 7;</code>
   */
  boolean hasStatus();
  /**
   * <pre>
   *状态:1有效2无效
   * </pre>
   *
   * <code>optional int32 status = 7;</code>
   */
  int getStatus();

  /**
   * <pre>
   *版本号    
   * </pre>
   *
   * <code>optional int32 version = 8 [default = 0];</code>
   */
  boolean hasVersion();
  /**
   * <pre>
   *版本号    
   * </pre>
   *
   * <code>optional int32 version = 8 [default = 0];</code>
   */
  int getVersion();

  /**
   * <pre>
   *渠道账户名称
   * </pre>
   *
   * <code>optional string name = 9;</code>
   */
  boolean hasName();
  /**
   * <pre>
   *渠道账户名称
   * </pre>
   *
   * <code>optional string name = 9;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   *渠道账户名称
   * </pre>
   *
   * <code>optional string name = 9;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *渠道实体id， 参见Company.id
   * </pre>
   *
   * <code>optional int64 entity_id = 11;</code>
   */
  boolean hasEntityId();
  /**
   * <pre>
   *渠道实体id， 参见Company.id
   * </pre>
   *
   * <code>optional int64 entity_id = 11;</code>
   */
  long getEntityId();

  /**
   * <pre>
   *支付服务id，对应PaymentService表的Id
   * </pre>
   *
   * <code>optional int64 service_id = 14;</code>
   */
  boolean hasServiceId();
  /**
   * <pre>
   *支付服务id，对应PaymentService表的Id
   * </pre>
   *
   * <code>optional int64 service_id = 14;</code>
   */
  long getServiceId();

  /**
   * <pre>
   *和该渠道做签约公司id，参见Company.id
   * </pre>
   *
   * <code>optional int64 sign_corp_id = 15;</code>
   */
  boolean hasSignCorpId();
  /**
   * <pre>
   *和该渠道做签约公司id，参见Company.id
   * </pre>
   *
   * <code>optional int64 sign_corp_id = 15;</code>
   */
  long getSignCorpId();

  /**
   * <pre>
   *收费标准，json串
   * </pre>
   *
   * <code>optional string fee = 16;</code>
   */
  boolean hasFee();
  /**
   * <pre>
   *收费标准，json串
   * </pre>
   *
   * <code>optional string fee = 16;</code>
   */
  java.lang.String getFee();
  /**
   * <pre>
   *收费标准，json串
   * </pre>
   *
   * <code>optional string fee = 16;</code>
   */
  com.google.protobuf.ByteString
      getFeeBytes();

  /**
   * <pre>
   *允许支付
   * </pre>
   *
   * <code>optional bool allow_pay = 23;</code>
   */
  boolean hasAllowPay();
  /**
   * <pre>
   *允许支付
   * </pre>
   *
   * <code>optional bool allow_pay = 23;</code>
   */
  boolean getAllowPay();

  /**
   * <pre>
   *允许退款
   * </pre>
   *
   * <code>optional bool allow_drawback = 24;</code>
   */
  boolean hasAllowDrawback();
  /**
   * <pre>
   *允许退款
   * </pre>
   *
   * <code>optional bool allow_drawback = 24;</code>
   */
  boolean getAllowDrawback();

  /**
   * <pre>
   *在渠道开通的账户号
   * </pre>
   *
   * <code>optional string account_no = 17;</code>
   */
  boolean hasAccountNo();
  /**
   * <pre>
   *在渠道开通的账户号
   * </pre>
   *
   * <code>optional string account_no = 17;</code>
   */
  java.lang.String getAccountNo();
  /**
   * <pre>
   *在渠道开通的账户号
   * </pre>
   *
   * <code>optional string account_no = 17;</code>
   */
  com.google.protobuf.ByteString
      getAccountNoBytes();
}