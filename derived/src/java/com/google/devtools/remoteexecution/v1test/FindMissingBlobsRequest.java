// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/remoteexecution/v1test/remote_execution.proto

package com.google.devtools.remoteexecution.v1test;

/**
 * <pre>
 * A request message for
 * [ContentAddressableStorage.FindMissingBlobs][google.devtools.remoteexecution.v1test.ContentAddressableStorage.FindMissingBlobs].
 * </pre>
 *
 * Protobuf type {@code google.devtools.remoteexecution.v1test.FindMissingBlobsRequest}
 */
public  final class FindMissingBlobsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.remoteexecution.v1test.FindMissingBlobsRequest)
    FindMissingBlobsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindMissingBlobsRequest.newBuilder() to construct.
  private FindMissingBlobsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindMissingBlobsRequest() {
    instanceName_ = "";
    blobDigests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FindMissingBlobsRequest(
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
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              blobDigests_ = new java.util.ArrayList<com.google.devtools.remoteexecution.v1test.Digest>();
              mutable_bitField0_ |= 0x00000002;
            }
            blobDigests_.add(
                input.readMessage(com.google.devtools.remoteexecution.v1test.Digest.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        blobDigests_ = java.util.Collections.unmodifiableList(blobDigests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.remoteexecution.v1test.RemoteExecutionProto.internal_static_google_devtools_remoteexecution_v1test_FindMissingBlobsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.remoteexecution.v1test.RemoteExecutionProto.internal_static_google_devtools_remoteexecution_v1test_FindMissingBlobsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest.class, com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest.Builder.class);
  }

  private int bitField0_;
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

  public static final int BLOB_DIGESTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.devtools.remoteexecution.v1test.Digest> blobDigests_;
  /**
   * <pre>
   * A list of the blobs to check.
   * </pre>
   *
   * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
   */
  public java.util.List<com.google.devtools.remoteexecution.v1test.Digest> getBlobDigestsList() {
    return blobDigests_;
  }
  /**
   * <pre>
   * A list of the blobs to check.
   * </pre>
   *
   * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
   */
  public java.util.List<? extends com.google.devtools.remoteexecution.v1test.DigestOrBuilder> 
      getBlobDigestsOrBuilderList() {
    return blobDigests_;
  }
  /**
   * <pre>
   * A list of the blobs to check.
   * </pre>
   *
   * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
   */
  public int getBlobDigestsCount() {
    return blobDigests_.size();
  }
  /**
   * <pre>
   * A list of the blobs to check.
   * </pre>
   *
   * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
   */
  public com.google.devtools.remoteexecution.v1test.Digest getBlobDigests(int index) {
    return blobDigests_.get(index);
  }
  /**
   * <pre>
   * A list of the blobs to check.
   * </pre>
   *
   * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
   */
  public com.google.devtools.remoteexecution.v1test.DigestOrBuilder getBlobDigestsOrBuilder(
      int index) {
    return blobDigests_.get(index);
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
    for (int i = 0; i < blobDigests_.size(); i++) {
      output.writeMessage(2, blobDigests_.get(i));
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
    for (int i = 0; i < blobDigests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, blobDigests_.get(i));
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
    if (!(obj instanceof com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest other = (com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest) obj;

    boolean result = true;
    result = result && getInstanceName()
        .equals(other.getInstanceName());
    result = result && getBlobDigestsList()
        .equals(other.getBlobDigestsList());
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
    if (getBlobDigestsCount() > 0) {
      hash = (37 * hash) + BLOB_DIGESTS_FIELD_NUMBER;
      hash = (53 * hash) + getBlobDigestsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest prototype) {
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
   * [ContentAddressableStorage.FindMissingBlobs][google.devtools.remoteexecution.v1test.ContentAddressableStorage.FindMissingBlobs].
   * </pre>
   *
   * Protobuf type {@code google.devtools.remoteexecution.v1test.FindMissingBlobsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.remoteexecution.v1test.FindMissingBlobsRequest)
      com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.remoteexecution.v1test.RemoteExecutionProto.internal_static_google_devtools_remoteexecution_v1test_FindMissingBlobsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.remoteexecution.v1test.RemoteExecutionProto.internal_static_google_devtools_remoteexecution_v1test_FindMissingBlobsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest.class, com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest.Builder.class);
    }

    // Construct using com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest.newBuilder()
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
        getBlobDigestsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      instanceName_ = "";

      if (blobDigestsBuilder_ == null) {
        blobDigests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        blobDigestsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.remoteexecution.v1test.RemoteExecutionProto.internal_static_google_devtools_remoteexecution_v1test_FindMissingBlobsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest getDefaultInstanceForType() {
      return com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest build() {
      com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest buildPartial() {
      com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest result = new com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.instanceName_ = instanceName_;
      if (blobDigestsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          blobDigests_ = java.util.Collections.unmodifiableList(blobDigests_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.blobDigests_ = blobDigests_;
      } else {
        result.blobDigests_ = blobDigestsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest) {
        return mergeFrom((com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest other) {
      if (other == com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest.getDefaultInstance()) return this;
      if (!other.getInstanceName().isEmpty()) {
        instanceName_ = other.instanceName_;
        onChanged();
      }
      if (blobDigestsBuilder_ == null) {
        if (!other.blobDigests_.isEmpty()) {
          if (blobDigests_.isEmpty()) {
            blobDigests_ = other.blobDigests_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBlobDigestsIsMutable();
            blobDigests_.addAll(other.blobDigests_);
          }
          onChanged();
        }
      } else {
        if (!other.blobDigests_.isEmpty()) {
          if (blobDigestsBuilder_.isEmpty()) {
            blobDigestsBuilder_.dispose();
            blobDigestsBuilder_ = null;
            blobDigests_ = other.blobDigests_;
            bitField0_ = (bitField0_ & ~0x00000002);
            blobDigestsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBlobDigestsFieldBuilder() : null;
          } else {
            blobDigestsBuilder_.addAllMessages(other.blobDigests_);
          }
        }
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
      com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private java.util.List<com.google.devtools.remoteexecution.v1test.Digest> blobDigests_ =
      java.util.Collections.emptyList();
    private void ensureBlobDigestsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        blobDigests_ = new java.util.ArrayList<com.google.devtools.remoteexecution.v1test.Digest>(blobDigests_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.remoteexecution.v1test.Digest, com.google.devtools.remoteexecution.v1test.Digest.Builder, com.google.devtools.remoteexecution.v1test.DigestOrBuilder> blobDigestsBuilder_;

    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public java.util.List<com.google.devtools.remoteexecution.v1test.Digest> getBlobDigestsList() {
      if (blobDigestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(blobDigests_);
      } else {
        return blobDigestsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public int getBlobDigestsCount() {
      if (blobDigestsBuilder_ == null) {
        return blobDigests_.size();
      } else {
        return blobDigestsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public com.google.devtools.remoteexecution.v1test.Digest getBlobDigests(int index) {
      if (blobDigestsBuilder_ == null) {
        return blobDigests_.get(index);
      } else {
        return blobDigestsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public Builder setBlobDigests(
        int index, com.google.devtools.remoteexecution.v1test.Digest value) {
      if (blobDigestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlobDigestsIsMutable();
        blobDigests_.set(index, value);
        onChanged();
      } else {
        blobDigestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public Builder setBlobDigests(
        int index, com.google.devtools.remoteexecution.v1test.Digest.Builder builderForValue) {
      if (blobDigestsBuilder_ == null) {
        ensureBlobDigestsIsMutable();
        blobDigests_.set(index, builderForValue.build());
        onChanged();
      } else {
        blobDigestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public Builder addBlobDigests(com.google.devtools.remoteexecution.v1test.Digest value) {
      if (blobDigestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlobDigestsIsMutable();
        blobDigests_.add(value);
        onChanged();
      } else {
        blobDigestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public Builder addBlobDigests(
        int index, com.google.devtools.remoteexecution.v1test.Digest value) {
      if (blobDigestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlobDigestsIsMutable();
        blobDigests_.add(index, value);
        onChanged();
      } else {
        blobDigestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public Builder addBlobDigests(
        com.google.devtools.remoteexecution.v1test.Digest.Builder builderForValue) {
      if (blobDigestsBuilder_ == null) {
        ensureBlobDigestsIsMutable();
        blobDigests_.add(builderForValue.build());
        onChanged();
      } else {
        blobDigestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public Builder addBlobDigests(
        int index, com.google.devtools.remoteexecution.v1test.Digest.Builder builderForValue) {
      if (blobDigestsBuilder_ == null) {
        ensureBlobDigestsIsMutable();
        blobDigests_.add(index, builderForValue.build());
        onChanged();
      } else {
        blobDigestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public Builder addAllBlobDigests(
        java.lang.Iterable<? extends com.google.devtools.remoteexecution.v1test.Digest> values) {
      if (blobDigestsBuilder_ == null) {
        ensureBlobDigestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, blobDigests_);
        onChanged();
      } else {
        blobDigestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public Builder clearBlobDigests() {
      if (blobDigestsBuilder_ == null) {
        blobDigests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        blobDigestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public Builder removeBlobDigests(int index) {
      if (blobDigestsBuilder_ == null) {
        ensureBlobDigestsIsMutable();
        blobDigests_.remove(index);
        onChanged();
      } else {
        blobDigestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public com.google.devtools.remoteexecution.v1test.Digest.Builder getBlobDigestsBuilder(
        int index) {
      return getBlobDigestsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public com.google.devtools.remoteexecution.v1test.DigestOrBuilder getBlobDigestsOrBuilder(
        int index) {
      if (blobDigestsBuilder_ == null) {
        return blobDigests_.get(index);  } else {
        return blobDigestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public java.util.List<? extends com.google.devtools.remoteexecution.v1test.DigestOrBuilder> 
         getBlobDigestsOrBuilderList() {
      if (blobDigestsBuilder_ != null) {
        return blobDigestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(blobDigests_);
      }
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public com.google.devtools.remoteexecution.v1test.Digest.Builder addBlobDigestsBuilder() {
      return getBlobDigestsFieldBuilder().addBuilder(
          com.google.devtools.remoteexecution.v1test.Digest.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public com.google.devtools.remoteexecution.v1test.Digest.Builder addBlobDigestsBuilder(
        int index) {
      return getBlobDigestsFieldBuilder().addBuilder(
          index, com.google.devtools.remoteexecution.v1test.Digest.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of the blobs to check.
     * </pre>
     *
     * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
     */
    public java.util.List<com.google.devtools.remoteexecution.v1test.Digest.Builder> 
         getBlobDigestsBuilderList() {
      return getBlobDigestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.remoteexecution.v1test.Digest, com.google.devtools.remoteexecution.v1test.Digest.Builder, com.google.devtools.remoteexecution.v1test.DigestOrBuilder> 
        getBlobDigestsFieldBuilder() {
      if (blobDigestsBuilder_ == null) {
        blobDigestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.remoteexecution.v1test.Digest, com.google.devtools.remoteexecution.v1test.Digest.Builder, com.google.devtools.remoteexecution.v1test.DigestOrBuilder>(
                blobDigests_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        blobDigests_ = null;
      }
      return blobDigestsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.remoteexecution.v1test.FindMissingBlobsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.remoteexecution.v1test.FindMissingBlobsRequest)
  private static final com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest();
  }

  public static com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindMissingBlobsRequest>
      PARSER = new com.google.protobuf.AbstractParser<FindMissingBlobsRequest>() {
    @java.lang.Override
    public FindMissingBlobsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FindMissingBlobsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FindMissingBlobsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindMissingBlobsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.remoteexecution.v1test.FindMissingBlobsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

