// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person2.proto

package tm;

public final class Person2OuterClass {
  private Person2OuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Person2OrBuilder extends
      // @@protoc_insertion_point(interface_extends:tm.Person2)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 声明指定类数据类型的属性
     * </pre>
     *
     * <code>.tm.Person child = 1;</code>
     */
    boolean hasChild();
    /**
     * <pre>
     * 声明指定类数据类型的属性
     * </pre>
     *
     * <code>.tm.Person child = 1;</code>
     */
    tm.PersonOuterClass.Person getChild();
    /**
     * <pre>
     * 声明指定类数据类型的属性
     * </pre>
     *
     * <code>.tm.Person child = 1;</code>
     */
    tm.PersonOuterClass.PersonOrBuilder getChildOrBuilder();
  }
  /**
   * Protobuf type {@code tm.Person2}
   */
  public  static final class Person2 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tm.Person2)
      Person2OrBuilder {
    // Use Person2.newBuilder() to construct.
    private Person2(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Person2() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Person2(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              tm.PersonOuterClass.Person.Builder subBuilder = null;
              if (child_ != null) {
                subBuilder = child_.toBuilder();
              }
              child_ = input.readMessage(tm.PersonOuterClass.Person.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(child_);
                child_ = subBuilder.buildPartial();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tm.Person2OuterClass.internal_static_tm_Person2_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tm.Person2OuterClass.internal_static_tm_Person2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tm.Person2OuterClass.Person2.class, tm.Person2OuterClass.Person2.Builder.class);
    }

    public static final int CHILD_FIELD_NUMBER = 1;
    private tm.PersonOuterClass.Person child_;
    /**
     * <pre>
     * 声明指定类数据类型的属性
     * </pre>
     *
     * <code>.tm.Person child = 1;</code>
     */
    public boolean hasChild() {
      return child_ != null;
    }
    /**
     * <pre>
     * 声明指定类数据类型的属性
     * </pre>
     *
     * <code>.tm.Person child = 1;</code>
     */
    public tm.PersonOuterClass.Person getChild() {
      return child_ == null ? tm.PersonOuterClass.Person.getDefaultInstance() : child_;
    }
    /**
     * <pre>
     * 声明指定类数据类型的属性
     * </pre>
     *
     * <code>.tm.Person child = 1;</code>
     */
    public tm.PersonOuterClass.PersonOrBuilder getChildOrBuilder() {
      return getChild();
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (child_ != null) {
        output.writeMessage(1, getChild());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (child_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getChild());
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof tm.Person2OuterClass.Person2)) {
        return super.equals(obj);
      }
      tm.Person2OuterClass.Person2 other = (tm.Person2OuterClass.Person2) obj;

      boolean result = true;
      result = result && (hasChild() == other.hasChild());
      if (hasChild()) {
        result = result && getChild()
            .equals(other.getChild());
      }
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasChild()) {
        hash = (37 * hash) + CHILD_FIELD_NUMBER;
        hash = (53 * hash) + getChild().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tm.Person2OuterClass.Person2 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tm.Person2OuterClass.Person2 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tm.Person2OuterClass.Person2 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tm.Person2OuterClass.Person2 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tm.Person2OuterClass.Person2 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tm.Person2OuterClass.Person2 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static tm.Person2OuterClass.Person2 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static tm.Person2OuterClass.Person2 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tm.Person2OuterClass.Person2 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tm.Person2OuterClass.Person2 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(tm.Person2OuterClass.Person2 prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code tm.Person2}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tm.Person2)
        tm.Person2OuterClass.Person2OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tm.Person2OuterClass.internal_static_tm_Person2_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tm.Person2OuterClass.internal_static_tm_Person2_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tm.Person2OuterClass.Person2.class, tm.Person2OuterClass.Person2.Builder.class);
      }

      // Construct using tm.Person2OuterClass.Person2.newBuilder()
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
      public Builder clear() {
        super.clear();
        if (childBuilder_ == null) {
          child_ = null;
        } else {
          child_ = null;
          childBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tm.Person2OuterClass.internal_static_tm_Person2_descriptor;
      }

      public tm.Person2OuterClass.Person2 getDefaultInstanceForType() {
        return tm.Person2OuterClass.Person2.getDefaultInstance();
      }

      public tm.Person2OuterClass.Person2 build() {
        tm.Person2OuterClass.Person2 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public tm.Person2OuterClass.Person2 buildPartial() {
        tm.Person2OuterClass.Person2 result = new tm.Person2OuterClass.Person2(this);
        if (childBuilder_ == null) {
          result.child_ = child_;
        } else {
          result.child_ = childBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof tm.Person2OuterClass.Person2) {
          return mergeFrom((tm.Person2OuterClass.Person2)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tm.Person2OuterClass.Person2 other) {
        if (other == tm.Person2OuterClass.Person2.getDefaultInstance()) return this;
        if (other.hasChild()) {
          mergeChild(other.getChild());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        tm.Person2OuterClass.Person2 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (tm.Person2OuterClass.Person2) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private tm.PersonOuterClass.Person child_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          tm.PersonOuterClass.Person, tm.PersonOuterClass.Person.Builder, tm.PersonOuterClass.PersonOrBuilder> childBuilder_;
      /**
       * <pre>
       * 声明指定类数据类型的属性
       * </pre>
       *
       * <code>.tm.Person child = 1;</code>
       */
      public boolean hasChild() {
        return childBuilder_ != null || child_ != null;
      }
      /**
       * <pre>
       * 声明指定类数据类型的属性
       * </pre>
       *
       * <code>.tm.Person child = 1;</code>
       */
      public tm.PersonOuterClass.Person getChild() {
        if (childBuilder_ == null) {
          return child_ == null ? tm.PersonOuterClass.Person.getDefaultInstance() : child_;
        } else {
          return childBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * 声明指定类数据类型的属性
       * </pre>
       *
       * <code>.tm.Person child = 1;</code>
       */
      public Builder setChild(tm.PersonOuterClass.Person value) {
        if (childBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          child_ = value;
          onChanged();
        } else {
          childBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * 声明指定类数据类型的属性
       * </pre>
       *
       * <code>.tm.Person child = 1;</code>
       */
      public Builder setChild(
          tm.PersonOuterClass.Person.Builder builderForValue) {
        if (childBuilder_ == null) {
          child_ = builderForValue.build();
          onChanged();
        } else {
          childBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * 声明指定类数据类型的属性
       * </pre>
       *
       * <code>.tm.Person child = 1;</code>
       */
      public Builder mergeChild(tm.PersonOuterClass.Person value) {
        if (childBuilder_ == null) {
          if (child_ != null) {
            child_ =
              tm.PersonOuterClass.Person.newBuilder(child_).mergeFrom(value).buildPartial();
          } else {
            child_ = value;
          }
          onChanged();
        } else {
          childBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * 声明指定类数据类型的属性
       * </pre>
       *
       * <code>.tm.Person child = 1;</code>
       */
      public Builder clearChild() {
        if (childBuilder_ == null) {
          child_ = null;
          onChanged();
        } else {
          child_ = null;
          childBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * 声明指定类数据类型的属性
       * </pre>
       *
       * <code>.tm.Person child = 1;</code>
       */
      public tm.PersonOuterClass.Person.Builder getChildBuilder() {
        
        onChanged();
        return getChildFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * 声明指定类数据类型的属性
       * </pre>
       *
       * <code>.tm.Person child = 1;</code>
       */
      public tm.PersonOuterClass.PersonOrBuilder getChildOrBuilder() {
        if (childBuilder_ != null) {
          return childBuilder_.getMessageOrBuilder();
        } else {
          return child_ == null ?
              tm.PersonOuterClass.Person.getDefaultInstance() : child_;
        }
      }
      /**
       * <pre>
       * 声明指定类数据类型的属性
       * </pre>
       *
       * <code>.tm.Person child = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          tm.PersonOuterClass.Person, tm.PersonOuterClass.Person.Builder, tm.PersonOuterClass.PersonOrBuilder> 
          getChildFieldBuilder() {
        if (childBuilder_ == null) {
          childBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              tm.PersonOuterClass.Person, tm.PersonOuterClass.Person.Builder, tm.PersonOuterClass.PersonOrBuilder>(
                  getChild(),
                  getParentForChildren(),
                  isClean());
          child_ = null;
        }
        return childBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:tm.Person2)
    }

    // @@protoc_insertion_point(class_scope:tm.Person2)
    private static final tm.Person2OuterClass.Person2 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tm.Person2OuterClass.Person2();
    }

    public static tm.Person2OuterClass.Person2 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Person2>
        PARSER = new com.google.protobuf.AbstractParser<Person2>() {
      public Person2 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Person2(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Person2> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Person2> getParserForType() {
      return PARSER;
    }

    public tm.Person2OuterClass.Person2 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tm_Person2_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tm_Person2_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rperson2.proto\022\002tm\032\014person.proto\"$\n\007Per" +
      "son2\022\031\n\005child\030\001 \001(\0132\n.tm.Personb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          tm.PersonOuterClass.getDescriptor(),
        }, assigner);
    internal_static_tm_Person2_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tm_Person2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tm_Person2_descriptor,
        new java.lang.String[] { "Child", });
    tm.PersonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
