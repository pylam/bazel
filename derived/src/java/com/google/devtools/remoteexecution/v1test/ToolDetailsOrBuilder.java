// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/remoteexecution/v1test/remote_execution.proto

package com.google.devtools.remoteexecution.v1test;

public interface ToolDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.remoteexecution.v1test.ToolDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the tool, e.g. bazel.
   * </pre>
   *
   * <code>string tool_name = 1;</code>
   */
  java.lang.String getToolName();
  /**
   * <pre>
   * Name of the tool, e.g. bazel.
   * </pre>
   *
   * <code>string tool_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getToolNameBytes();

  /**
   * <pre>
   * Version of the tool used for the request, e.g. 5.0.3.
   * </pre>
   *
   * <code>string tool_version = 2;</code>
   */
  java.lang.String getToolVersion();
  /**
   * <pre>
   * Version of the tool used for the request, e.g. 5.0.3.
   * </pre>
   *
   * <code>string tool_version = 2;</code>
   */
  com.google.protobuf.ByteString
      getToolVersionBytes();
}
