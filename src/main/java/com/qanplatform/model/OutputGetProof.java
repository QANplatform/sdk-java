/*
 * QAN AutoApi
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.qanplatform.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.qanplatform.model.ResponseStorageEntry;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.qanplatform.invoker.JSON;

/**
 * OutputGetProof
 */

public class OutputGetProof {
  public static final String SERIALIZED_NAME_$_SCHEMA = "$schema";
  @SerializedName(SERIALIZED_NAME_$_SCHEMA)
  private URI $schema;

  public static final String SERIALIZED_NAME_ACCOUNT_PROOF = "AccountProof";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_PROOF)
  private String accountProof;

  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_BALANCE = "Balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;

  public static final String SERIALIZED_NAME_CODE_HASH = "CodeHash";
  @SerializedName(SERIALIZED_NAME_CODE_HASH)
  private String codeHash;

  public static final String SERIALIZED_NAME_NONCE = "Nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_STORAGE_HASH = "StorageHash";
  @SerializedName(SERIALIZED_NAME_STORAGE_HASH)
  private String storageHash;

  public static final String SERIALIZED_NAME_STORAGE_PROOF = "StorageProof";
  @SerializedName(SERIALIZED_NAME_STORAGE_PROOF)
  private List<ResponseStorageEntry> storageProof = new ArrayList<>();

  public OutputGetProof() {
  }

  public OutputGetProof(
     URI $schema
  ) {
    this();
    this.$schema = $schema;
  }

  /**
   * A URL to the JSON Schema for this object.
   * @return $schema
   */
  @javax.annotation.Nullable
  public URI get$Schema() {
    return $schema;
  }



  public OutputGetProof accountProof(String accountProof) {
    this.accountProof = accountProof;
    return this;
  }

  /**
   * An array of rlp-serialized MerkleTree-Nodes which starts with the stateRoot-Node and follows the path of the SHA3 address as key
   * @return accountProof
   */
  @javax.annotation.Nonnull
  public String getAccountProof() {
    return accountProof;
  }

  public void setAccountProof(String accountProof) {
    this.accountProof = accountProof;
  }


  public OutputGetProof address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The address associated with the account
   * @return address
   */
  @javax.annotation.Nonnull
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public OutputGetProof balance(String balance) {
    this.balance = balance;
    return this;
  }

  /**
   * The current balance of the account in wei
   * @return balance
   */
  @javax.annotation.Nonnull
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }


  public OutputGetProof codeHash(String codeHash) {
    this.codeHash = codeHash;
    return this;
  }

  /**
   * A 32 byte hash of the code of the account
   * @return codeHash
   */
  @javax.annotation.Nonnull
  public String getCodeHash() {
    return codeHash;
  }

  public void setCodeHash(String codeHash) {
    this.codeHash = codeHash;
  }


  public OutputGetProof nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

  /**
   * The hash of the generated proof-of-work. Null if pending
   * @return nonce
   */
  @javax.annotation.Nullable
  public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public OutputGetProof storageHash(String storageHash) {
    this.storageHash = storageHash;
    return this;
  }

  /**
   * A 32 byte SHA3 of the storageRoot. All storage will deliver a MerkleProof starting with this rootHash
   * @return storageHash
   */
  @javax.annotation.Nonnull
  public String getStorageHash() {
    return storageHash;
  }

  public void setStorageHash(String storageHash) {
    this.storageHash = storageHash;
  }


  public OutputGetProof storageProof(List<ResponseStorageEntry> storageProof) {
    this.storageProof = storageProof;
    return this;
  }

  public OutputGetProof addStorageProofItem(ResponseStorageEntry storageProofItem) {
    if (this.storageProof == null) {
      this.storageProof = new ArrayList<>();
    }
    this.storageProof.add(storageProofItem);
    return this;
  }

  /**
   * An array of storage-entries as requested. Each entry is an object with the following fields:
   * @return storageProof
   */
  @javax.annotation.Nonnull
  public List<ResponseStorageEntry> getStorageProof() {
    return storageProof;
  }

  public void setStorageProof(List<ResponseStorageEntry> storageProof) {
    this.storageProof = storageProof;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputGetProof outputGetProof = (OutputGetProof) o;
    return Objects.equals(this.$schema, outputGetProof.$schema) &&
        Objects.equals(this.accountProof, outputGetProof.accountProof) &&
        Objects.equals(this.address, outputGetProof.address) &&
        Objects.equals(this.balance, outputGetProof.balance) &&
        Objects.equals(this.codeHash, outputGetProof.codeHash) &&
        Objects.equals(this.nonce, outputGetProof.nonce) &&
        Objects.equals(this.storageHash, outputGetProof.storageHash) &&
        Objects.equals(this.storageProof, outputGetProof.storageProof);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, accountProof, address, balance, codeHash, nonce, storageHash, storageProof);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputGetProof {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    accountProof: ").append(toIndentedString(accountProof)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    codeHash: ").append(toIndentedString(codeHash)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    storageHash: ").append(toIndentedString(storageHash)).append("\n");
    sb.append("    storageProof: ").append(toIndentedString(storageProof)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("$schema");
    openapiFields.add("AccountProof");
    openapiFields.add("Address");
    openapiFields.add("Balance");
    openapiFields.add("CodeHash");
    openapiFields.add("Nonce");
    openapiFields.add("StorageHash");
    openapiFields.add("StorageProof");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AccountProof");
    openapiRequiredFields.add("Address");
    openapiRequiredFields.add("Balance");
    openapiRequiredFields.add("CodeHash");
    openapiRequiredFields.add("Nonce");
    openapiRequiredFields.add("StorageHash");
    openapiRequiredFields.add("StorageProof");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OutputGetProof
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OutputGetProof.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutputGetProof is not found in the empty JSON string", OutputGetProof.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OutputGetProof.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OutputGetProof` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OutputGetProof.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("$schema") != null && !jsonObj.get("$schema").isJsonNull()) && !jsonObj.get("$schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$schema").toString()));
      }
      if (!jsonObj.get("AccountProof").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountProof` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountProof").toString()));
      }
      if (!jsonObj.get("Address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Address").toString()));
      }
      if (!jsonObj.get("Balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Balance").toString()));
      }
      if (!jsonObj.get("CodeHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CodeHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CodeHash").toString()));
      }
      if ((jsonObj.get("Nonce") != null && !jsonObj.get("Nonce").isJsonNull()) && !jsonObj.get("Nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Nonce").toString()));
      }
      if (!jsonObj.get("StorageHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StorageHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StorageHash").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("StorageProof").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `StorageProof` to be an array in the JSON string but got `%s`", jsonObj.get("StorageProof").toString()));
      }

      JsonArray jsonArraystorageProof = jsonObj.getAsJsonArray("StorageProof");
      // validate the required field `StorageProof` (array)
      for (int i = 0; i < jsonArraystorageProof.size(); i++) {
        ResponseStorageEntry.validateJsonElement(jsonArraystorageProof.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutputGetProof.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutputGetProof' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutputGetProof> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutputGetProof.class));

       return (TypeAdapter<T>) new TypeAdapter<OutputGetProof>() {
           @Override
           public void write(JsonWriter out, OutputGetProof value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutputGetProof read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OutputGetProof given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OutputGetProof
   * @throws IOException if the JSON string is invalid with respect to OutputGetProof
   */
  public static OutputGetProof fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutputGetProof.class);
  }

  /**
   * Convert an instance of OutputGetProof to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

