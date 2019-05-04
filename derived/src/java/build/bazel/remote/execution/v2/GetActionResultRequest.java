// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

/**
 * <pre>
 * A request message for
 * [ActionCache.GetActionResult][build.bazel.remote.execution.v2.ActionCache.GetActionResult].
 * </pre>
 *
 * Protobuf type {@code build.bazel.remote.execution.v2.GetActionResultRequest}
 */
public  final class GetActionResultRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.bazel.remote.execution.v2.GetActionResultRequest)
    GetActionResultRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetActionResultRequest.newBuilder() to construct.
  private GetActionResultRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetActionResultRequest() {
    instanceName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetActionResultRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            instanceName_ = s;
            break;
          }
          case 18: {
            build.bazel.remote.execution.v2.Digest.Builder subBuilder = null;
            if (actionDigest_ != null) {
              subBuilder = actionDigest_.toBuilder();
            }
            actionDigest_ = input.readMessage(build.bazel.remote.execution.v2.Digest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(actionDigest_);
              actionDigest_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_GetActionResultRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_GetActionResultRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.bazel.remote.execution.v2.GetActionResultRequest.class, build.bazel.remote.execution.v2.GetActionResultRequest.Builder.class);
  }

  public static final int INSTANCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object instanceName_;
  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   */
  public java.lang.String getInstanceName() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getInstanceNameBytes() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_DIGEST_FIELD_NUMBER = 2;
  private build.bazel.remote.execution.v2.Digest actionDigest_;
  /**
   * <pre>
   * The digest of the [Action][build.bazel.remote.execution.v2.Action]
   * whose result is requested.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
   */
  public boolean hasActionDigest() {
    return actionDigest_ != null;
  }
  /**
   * <pre>
   * The digest of the [Action][build.bazel.remote.execution.v2.Action]
   * whose result is requested.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
   */
  public build.bazel.remote.execution.v2.Digest getActionDigest() {
    return actionDigest_ == null ? build.bazel.remote.execution.v2.Digest.getDefaultInstance() : actionDigest_;
  }
  /**
   * <pre>
   * The digest of the [Action][build.bazel.remote.execution.v2.Action]
   * whose result is requested.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
   */
  public build.bazel.remote.execution.v2.DigestOrBuilder getActionDigestOrBuilder() {
    return getActionDigest();
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
    if (!getInstanceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instanceName_);
    }
    if (actionDigest_ != null) {
      output.writeMessage(2, getActionDigest());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInstanceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instanceName_);
    }
    if (actionDigest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getActionDigest());
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
    if (!(obj instanceof build.bazel.remote.execution.v2.GetActionResultRequest)) {
      return super.equals(obj);
    }
    build.bazel.remote.execution.v2.GetActionResultRequest other = (build.bazel.remote.execution.v2.GetActionResultRequest) obj;

    boolean result = true;
    result = result && getInstanceName()
        .equals(other.getInstanceName());
    result = result && (hasActionDigest() == other.hasActionDigest());
    if (hasActionDigest()) {
      result = result && getActionDigest()
          .equals(other.getActionDigest());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INSTANCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceName().hashCode();
    if (hasActionDigest()) {
      hash = (37 * hash) + ACTION_DIGEST_FIELD_NUMBER;
      hash = (53 * hash) + getActionDigest().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.bazel.remote.execution.v2.GetActionResultRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.GetActionResultRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.GetActionResultRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.GetActionResultRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.GetActionResultRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.GetActionResultRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.GetActionResultRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.GetActionResultRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.GetActionResultRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.GetActionResultRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.GetActionResultRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.GetActionResultRequest parseFrom(
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
  public static Builder newBuilder(build.bazel.remote.execution.v2.GetActionResultRequest prototype) {
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
   * <pre>
   * A request message for
   * [ActionCache.GetActionResult][build.bazel.remote.execution.v2.ActionCache.GetActionResult].
   * </pre>
   *
   * Protobuf type {@code build.bazel.remote.execution.v2.GetActionResultRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.bazel.remote.execution.v2.GetActionResultRequest)
      build.bazel.remote.execution.v2.GetActionResultRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_GetActionResultRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_GetActionResultRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.bazel.remote.execution.v2.GetActionResultRequest.class, build.bazel.remote.execution.v2.GetActionResultRequest.Builder.class);
    }

    // Construct using build.bazel.remote.execution.v2.GetActionResultRequest.newBuilder()
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
      instanceName_ = "";

      if (actionDigestBuilder_ == null) {
        actionDigest_ = null;
      } else {
        actionDigest_ = null;
        actionDigestBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_GetActionResultRequest_descriptor;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.GetActionResultRequest getDefaultInstanceForType() {
      return build.bazel.remote.execution.v2.GetActionResultRequest.getDefaultInstance();
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.GetActionResultRequest build() {
      build.bazel.remote.execution.v2.GetActionResultRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.GetActionResultRequest buildPartial() {
      build.bazel.remote.execution.v2.GetActionResultRequest result = new build.bazel.remote.execution.v2.GetActionResultRequest(this);
      result.instanceName_ = instanceName_;
      if (actionDigestBuilder_ == null) {
        result.actionDigest_ = actionDigest_;
      } else {
        result.actionDigest_ = actionDigestBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.bazel.remote.execution.v2.GetActionResultRequest) {
        return mergeFrom((build.bazel.remote.execution.v2.GetActionResultRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.bazel.remote.execution.v2.GetActionResultRequest other) {
      if (other == build.bazel.remote.execution.v2.GetActionResultRequest.getDefaultInstance()) return this;
      if (!other.getInstanceName().isEmpty()) {
        instanceName_ = other.instanceName_;
        onChanged();
      }
      if (other.hasActionDigest()) {
        mergeActionDigest(other.getActionDigest());
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
      build.bazel.remote.execution.v2.GetActionResultRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.bazel.remote.execution.v2.GetActionResultRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object instanceName_ = "";
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     */
    public java.lang.String getInstanceName() {
      java.lang.Object ref = instanceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getInstanceNameBytes() {
      java.lang.Object ref = instanceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     */
    public Builder setInstanceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     */
    public Builder clearInstanceName() {
      
      instanceName_ = getDefaultInstance().getInstanceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     */
    public Builder setInstanceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceName_ = value;
      onChanged();
      return this;
    }

    private build.bazel.remote.execution.v2.Digest actionDigest_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder> actionDigestBuilder_;
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * whose result is requested.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public boolean hasActionDigest() {
      return actionDigestBuilder_ != null || actionDigest_ != null;
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * whose result is requested.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public build.bazel.remote.execution.v2.Digest getActionDigest() {
      if (actionDigestBuilder_ == null) {
        return actionDigest_ == null ? build.bazel.remote.execution.v2.Digest.getDefaultInstance() : actionDigest_;
      } else {
        return actionDigestBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * whose result is requested.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public Builder setActionDigest(build.bazel.remote.execution.v2.Digest value) {
      if (actionDigestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        actionDigest_ = value;
        onChanged();
      } else {
        actionDigestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * whose result is requested.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public Builder setActionDigest(
        build.bazel.remote.execution.v2.Digest.Builder builderForValue) {
      if (actionDigestBuilder_ == null) {
        actionDigest_ = builderForValue.build();
        onChanged();
      } else {
        actionDigestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * whose result is requested.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public Builder mergeActionDigest(build.bazel.remote.execution.v2.Digest value) {
      if (actionDigestBuilder_ == null) {
        if (actionDigest_ != null) {
          actionDigest_ =
            build.bazel.remote.execution.v2.Digest.newBuilder(actionDigest_).mergeFrom(value).buildPartial();
        } else {
          actionDigest_ = value;
        }
        onChanged();
      } else {
        actionDigestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * whose result is requested.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public Builder clearActionDigest() {
      if (actionDigestBuilder_ == null) {
        actionDigest_ = null;
        onChanged();
      } else {
        actionDigest_ = null;
        actionDigestBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * whose result is requested.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public build.bazel.remote.execution.v2.Digest.Builder getActionDigestBuilder() {
      
      onChanged();
      return getActionDigestFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * whose result is requested.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public build.bazel.remote.execution.v2.DigestOrBuilder getActionDigestOrBuilder() {
      if (actionDigestBuilder_ != null) {
        return actionDigestBuilder_.getMessageOrBuilder();
      } else {
        return actionDigest_ == null ?
            build.bazel.remote.execution.v2.Digest.getDefaultInstance() : actionDigest_;
      }
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * whose result is requested.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder> 
        getActionDigestFieldBuilder() {
      if (actionDigestBuilder_ == null) {
        actionDigestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder>(
                getActionDigest(),
                getParentForChildren(),
                isClean());
        actionDigest_ = null;
      }
      return actionDigestBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:build.bazel.remote.execution.v2.GetActionResultRequest)
  }

  // @@protoc_insertion_point(class_scope:build.bazel.remote.execution.v2.GetActionResultRequest)
  private static final build.bazel.remote.execution.v2.GetActionResultRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.bazel.remote.execution.v2.GetActionResultRequest();
  }

  public static build.bazel.remote.execution.v2.GetActionResultRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetActionResultRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetActionResultRequest>() {
    @java.lang.Override
    public GetActionResultRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetActionResultRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetActionResultRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetActionResultRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.bazel.remote.execution.v2.GetActionResultRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

