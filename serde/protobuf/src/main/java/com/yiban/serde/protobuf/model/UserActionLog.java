// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserActionLog.proto

package com.yiban.serde.protobuf.model;

/**
 * Protobuf type {@code com.yiban.serde.protobuf.model.UserActionLog}
 */
public final class UserActionLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.yiban.serde.protobuf.model.UserActionLog)
    UserActionLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserActionLog.newBuilder() to construct.
  private UserActionLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserActionLog() {
    userName_ = "";
    actionType_ = "";
    ipAddress_ = "";
    provience_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserActionLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserActionLog(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            userName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            actionType_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            ipAddress_ = s;
            break;
          }
          case 32: {

            gender_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            provience_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.yiban.serde.protobuf.model.UserActionLogModel.internal_static_com_yiban_serde_protobuf_model_UserActionLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.yiban.serde.protobuf.model.UserActionLogModel.internal_static_com_yiban_serde_protobuf_model_UserActionLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.yiban.serde.protobuf.model.UserActionLog.class, com.yiban.serde.protobuf.model.UserActionLog.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object userName_;
  /**
   * <code>string userName = 1;</code>
   * @return The userName.
   */
  @java.lang.Override
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <code>string userName = 1;</code>
   * @return The bytes for userName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTIONTYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object actionType_;
  /**
   * <code>string actionType = 2;</code>
   * @return The actionType.
   */
  @java.lang.Override
  public java.lang.String getActionType() {
    java.lang.Object ref = actionType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actionType_ = s;
      return s;
    }
  }
  /**
   * <code>string actionType = 2;</code>
   * @return The bytes for actionType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActionTypeBytes() {
    java.lang.Object ref = actionType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      actionType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IPADDRESS_FIELD_NUMBER = 3;
  private volatile java.lang.Object ipAddress_;
  /**
   * <code>string ipAddress = 3;</code>
   * @return The ipAddress.
   */
  @java.lang.Override
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string ipAddress = 3;</code>
   * @return The bytes for ipAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GENDER_FIELD_NUMBER = 4;
  private int gender_;
  /**
   * <code>int32 gender = 4;</code>
   * @return The gender.
   */
  @java.lang.Override
  public int getGender() {
    return gender_;
  }

  public static final int PROVIENCE_FIELD_NUMBER = 5;
  private volatile java.lang.Object provience_;
  /**
   * <code>string provience = 5;</code>
   * @return The provience.
   */
  @java.lang.Override
  public java.lang.String getProvience() {
    java.lang.Object ref = provience_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      provience_ = s;
      return s;
    }
  }
  /**
   * <code>string provience = 5;</code>
   * @return The bytes for provience.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProvienceBytes() {
    java.lang.Object ref = provience_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      provience_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userName_);
    }
    if (!getActionTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, actionType_);
    }
    if (!getIpAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ipAddress_);
    }
    if (gender_ != 0) {
      output.writeInt32(4, gender_);
    }
    if (!getProvienceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, provience_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userName_);
    }
    if (!getActionTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, actionType_);
    }
    if (!getIpAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ipAddress_);
    }
    if (gender_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, gender_);
    }
    if (!getProvienceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, provience_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.yiban.serde.protobuf.model.UserActionLog)) {
      return super.equals(obj);
    }
    com.yiban.serde.protobuf.model.UserActionLog other = (com.yiban.serde.protobuf.model.UserActionLog) obj;

    if (!getUserName()
        .equals(other.getUserName())) return false;
    if (!getActionType()
        .equals(other.getActionType())) return false;
    if (!getIpAddress()
        .equals(other.getIpAddress())) return false;
    if (getGender()
        != other.getGender()) return false;
    if (!getProvience()
        .equals(other.getProvience())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + ACTIONTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getActionType().hashCode();
    hash = (37 * hash) + IPADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (37 * hash) + GENDER_FIELD_NUMBER;
    hash = (53 * hash) + getGender();
    hash = (37 * hash) + PROVIENCE_FIELD_NUMBER;
    hash = (53 * hash) + getProvience().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.yiban.serde.protobuf.model.UserActionLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yiban.serde.protobuf.model.UserActionLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yiban.serde.protobuf.model.UserActionLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yiban.serde.protobuf.model.UserActionLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yiban.serde.protobuf.model.UserActionLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yiban.serde.protobuf.model.UserActionLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yiban.serde.protobuf.model.UserActionLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yiban.serde.protobuf.model.UserActionLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yiban.serde.protobuf.model.UserActionLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.yiban.serde.protobuf.model.UserActionLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yiban.serde.protobuf.model.UserActionLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yiban.serde.protobuf.model.UserActionLog parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.yiban.serde.protobuf.model.UserActionLog prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.yiban.serde.protobuf.model.UserActionLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.yiban.serde.protobuf.model.UserActionLog)
      com.yiban.serde.protobuf.model.UserActionLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yiban.serde.protobuf.model.UserActionLogModel.internal_static_com_yiban_serde_protobuf_model_UserActionLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yiban.serde.protobuf.model.UserActionLogModel.internal_static_com_yiban_serde_protobuf_model_UserActionLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yiban.serde.protobuf.model.UserActionLog.class, com.yiban.serde.protobuf.model.UserActionLog.Builder.class);
    }

    // Construct using com.yiban.serde.protobuf.model.UserActionLog.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userName_ = "";

      actionType_ = "";

      ipAddress_ = "";

      gender_ = 0;

      provience_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.yiban.serde.protobuf.model.UserActionLogModel.internal_static_com_yiban_serde_protobuf_model_UserActionLog_descriptor;
    }

    @java.lang.Override
    public com.yiban.serde.protobuf.model.UserActionLog getDefaultInstanceForType() {
      return com.yiban.serde.protobuf.model.UserActionLog.getDefaultInstance();
    }

    @java.lang.Override
    public com.yiban.serde.protobuf.model.UserActionLog build() {
      com.yiban.serde.protobuf.model.UserActionLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.yiban.serde.protobuf.model.UserActionLog buildPartial() {
      com.yiban.serde.protobuf.model.UserActionLog result = new com.yiban.serde.protobuf.model.UserActionLog(this);
      result.userName_ = userName_;
      result.actionType_ = actionType_;
      result.ipAddress_ = ipAddress_;
      result.gender_ = gender_;
      result.provience_ = provience_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.yiban.serde.protobuf.model.UserActionLog) {
        return mergeFrom((com.yiban.serde.protobuf.model.UserActionLog)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.yiban.serde.protobuf.model.UserActionLog other) {
      if (other == com.yiban.serde.protobuf.model.UserActionLog.getDefaultInstance()) return this;
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      if (!other.getActionType().isEmpty()) {
        actionType_ = other.actionType_;
        onChanged();
      }
      if (!other.getIpAddress().isEmpty()) {
        ipAddress_ = other.ipAddress_;
        onChanged();
      }
      if (other.getGender() != 0) {
        setGender(other.getGender());
      }
      if (!other.getProvience().isEmpty()) {
        provience_ = other.provience_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.yiban.serde.protobuf.model.UserActionLog parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.yiban.serde.protobuf.model.UserActionLog) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userName_ = "";
    /**
     * <code>string userName = 1;</code>
     * @return The userName.
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userName = 1;</code>
     * @return The bytes for userName.
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userName = 1;</code>
     * @param value The userName to set.
     * @return This builder for chaining.
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserName() {
      
      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 1;</code>
     * @param value The bytes for userName to set.
     * @return This builder for chaining.
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object actionType_ = "";
    /**
     * <code>string actionType = 2;</code>
     * @return The actionType.
     */
    public java.lang.String getActionType() {
      java.lang.Object ref = actionType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string actionType = 2;</code>
     * @return The bytes for actionType.
     */
    public com.google.protobuf.ByteString
        getActionTypeBytes() {
      java.lang.Object ref = actionType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actionType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string actionType = 2;</code>
     * @param value The actionType to set.
     * @return This builder for chaining.
     */
    public Builder setActionType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      actionType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string actionType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearActionType() {
      
      actionType_ = getDefaultInstance().getActionType();
      onChanged();
      return this;
    }
    /**
     * <code>string actionType = 2;</code>
     * @param value The bytes for actionType to set.
     * @return This builder for chaining.
     */
    public Builder setActionTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      actionType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ipAddress_ = "";
    /**
     * <code>string ipAddress = 3;</code>
     * @return The ipAddress.
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ipAddress = 3;</code>
     * @return The bytes for ipAddress.
     */
    public com.google.protobuf.ByteString
        getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ipAddress = 3;</code>
     * @param value The ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ipAddress = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpAddress() {
      
      ipAddress_ = getDefaultInstance().getIpAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string ipAddress = 3;</code>
     * @param value The bytes for ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipAddress_ = value;
      onChanged();
      return this;
    }

    private int gender_ ;
    /**
     * <code>int32 gender = 4;</code>
     * @return The gender.
     */
    @java.lang.Override
    public int getGender() {
      return gender_;
    }
    /**
     * <code>int32 gender = 4;</code>
     * @param value The gender to set.
     * @return This builder for chaining.
     */
    public Builder setGender(int value) {
      
      gender_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 gender = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGender() {
      
      gender_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object provience_ = "";
    /**
     * <code>string provience = 5;</code>
     * @return The provience.
     */
    public java.lang.String getProvience() {
      java.lang.Object ref = provience_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        provience_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string provience = 5;</code>
     * @return The bytes for provience.
     */
    public com.google.protobuf.ByteString
        getProvienceBytes() {
      java.lang.Object ref = provience_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        provience_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string provience = 5;</code>
     * @param value The provience to set.
     * @return This builder for chaining.
     */
    public Builder setProvience(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      provience_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string provience = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearProvience() {
      
      provience_ = getDefaultInstance().getProvience();
      onChanged();
      return this;
    }
    /**
     * <code>string provience = 5;</code>
     * @param value The bytes for provience to set.
     * @return This builder for chaining.
     */
    public Builder setProvienceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      provience_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.yiban.serde.protobuf.model.UserActionLog)
  }

  // @@protoc_insertion_point(class_scope:com.yiban.serde.protobuf.model.UserActionLog)
  private static final com.yiban.serde.protobuf.model.UserActionLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.yiban.serde.protobuf.model.UserActionLog();
  }

  public static com.yiban.serde.protobuf.model.UserActionLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserActionLog>
      PARSER = new com.google.protobuf.AbstractParser<UserActionLog>() {
    @java.lang.Override
    public UserActionLog parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserActionLog(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserActionLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserActionLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.yiban.serde.protobuf.model.UserActionLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

