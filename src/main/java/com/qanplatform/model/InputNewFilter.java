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
import com.qanplatform.model.FilterObject;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

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
 * InputNewFilter
 */

public class InputNewFilter {
  public static final String SERIALIZED_NAME_$_SCHEMA = "$schema";
  @SerializedName(SERIALIZED_NAME_$_SCHEMA)
  private URI $schema;

  public static final String SERIALIZED_NAME_FILTER_OBJECT = "FilterObject";
  @SerializedName(SERIALIZED_NAME_FILTER_OBJECT)
  private FilterObject filterObject;

  public InputNewFilter() {
  }

  public InputNewFilter(
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



  public InputNewFilter filterObject(FilterObject filterObject) {
    this.filterObject = filterObject;
    return this;
  }

  /**
   * Get filterObject
   * @return filterObject
   */
  @javax.annotation.Nonnull
  public FilterObject getFilterObject() {
    return filterObject;
  }

  public void setFilterObject(FilterObject filterObject) {
    this.filterObject = filterObject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputNewFilter inputNewFilter = (InputNewFilter) o;
    return Objects.equals(this.$schema, inputNewFilter.$schema) &&
        Objects.equals(this.filterObject, inputNewFilter.filterObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, filterObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputNewFilter {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    filterObject: ").append(toIndentedString(filterObject)).append("\n");
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
    openapiFields.add("FilterObject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FilterObject");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InputNewFilter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InputNewFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InputNewFilter is not found in the empty JSON string", InputNewFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InputNewFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InputNewFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InputNewFilter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("$schema") != null && !jsonObj.get("$schema").isJsonNull()) && !jsonObj.get("$schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$schema").toString()));
      }
      // validate the required field `FilterObject`
      FilterObject.validateJsonElement(jsonObj.get("FilterObject"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InputNewFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InputNewFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InputNewFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InputNewFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<InputNewFilter>() {
           @Override
           public void write(JsonWriter out, InputNewFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InputNewFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InputNewFilter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InputNewFilter
   * @throws IOException if the JSON string is invalid with respect to InputNewFilter
   */
  public static InputNewFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InputNewFilter.class);
  }

  /**
   * Convert an instance of InputNewFilter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

