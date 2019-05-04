// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

public interface FileNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.FileNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the file.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the file.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The digest of the file's content.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
   */
  boolean hasDigest();
  /**
   * <pre>
   * The digest of the file's content.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
   */
  build.bazel.remote.execution.v2.Digest getDigest();
  /**
   * <pre>
   * The digest of the file's content.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 2;</code>
   */
  build.bazel.remote.execution.v2.DigestOrBuilder getDigestOrBuilder();

  /**
   * <pre>
   * True if file is executable, false otherwise.
   * </pre>
   *
   * <code>bool is_executable = 4;</code>
   */
  boolean getIsExecutable();
}
