# QanApi

All URIs are relative to *https://rpc-testnet.qanplatform.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**qanBlockNumber**](QanApi.md#qanBlockNumber) | **GET** /blockNumber/ | Returns the latest block number of the blockchain. |
| [**qanCall**](QanApi.md#qanCall) | **POST** /call/ | Executes a new message call immediately without creating a transaction on the block chain. |
| [**qanChainId**](QanApi.md#qanChainId) | **GET** /chainId/ | Returns the current network/chain ID, used to sign replay-protected transaction introduced in EIP-155. |
| [**qanEstimateGas**](QanApi.md#qanEstimateGas) | **POST** /estimateGas/ | Returns an estimation of gas for a given transaction. |
| [**qanFeeHistory**](QanApi.md#qanFeeHistory) | **POST** /feeHistory/ | Returns the collection of historical gas information. |
| [**qanGasPrice**](QanApi.md#qanGasPrice) | **GET** /gasPrice/ | Returns the current gas price on the network in wei. |
| [**qanGetBalance**](QanApi.md#qanGetBalance) | **GET** /getBalance/{Address}/ | Returns the balance of the account of given address. |
| [**qanGetBlockByHash**](QanApi.md#qanGetBlockByHash) | **GET** /getBlockByHash/{Hash}/{TransactionDetailFlag}/ | Returns information of the block matching the given block hash. |
| [**qanGetBlockByNumber**](QanApi.md#qanGetBlockByNumber) | **GET** /getBlockByNumber/{BlockNumber}/{TransactionDetailFlag}/ | Returns information of the block matching the given block number. |
| [**qanGetBlockReceipts**](QanApi.md#qanGetBlockReceipts) | **GET** /getBlockReceipts/{BlockNumber}/ | Returns all transaction receipts for a given block. |
| [**qanGetBlockTransactionCountByHash**](QanApi.md#qanGetBlockTransactionCountByHash) | **GET** /getBlockTransactionCountByHash/{Hash}/ | Returns the number of transactions for the block matching the given block hash. |
| [**qanGetBlockTransactionCountByNumber**](QanApi.md#qanGetBlockTransactionCountByNumber) | **GET** /getBlockTransactionCountByNumber/{BlockNumber}/ | Returns the number of transactions for the block matching the given block number. |
| [**qanGetCode**](QanApi.md#qanGetCode) | **GET** /getCode/{Address}/ | Returns the compiled bytecode of a smart contract. |
| [**qanGetFilterChanges**](QanApi.md#qanGetFilterChanges) | **GET** /getFilterChanges/{FilterId}/ | Polling method for a filter, which returns an array of events that have occurred since the last poll. |
| [**qanGetFilterLogs**](QanApi.md#qanGetFilterLogs) | **GET** /getFilterLogs/{Id}/ | Returns an array of all logs matching filter with given id. |
| [**qanGetLogs**](QanApi.md#qanGetLogs) | **POST** /getLogs/ | Returns an array of all logs matching a given filter object. |
| [**qanGetProof**](QanApi.md#qanGetProof) | **POST** /getProof/ | Returns the account and storage values of the specified account including the Merkle-proof. |
| [**qanGetStorageAt**](QanApi.md#qanGetStorageAt) | **POST** /getStorageAt/ | Returns the value from a storage position at a given address. |
| [**qanGetTransactionByBlockHashAndIndex**](QanApi.md#qanGetTransactionByBlockHashAndIndex) | **GET** /getTransactionByBlockHashAndIndex/{blockHash}/{index}/ | Returns information about a transaction given a blockhash and transaction index position. |
| [**qanGetTransactionByBlockNumberAndIndex**](QanApi.md#qanGetTransactionByBlockNumberAndIndex) | **GET** /getTransactionByBlockNumberAndIndex/{blockNumber}/{index}/ | Returns information about a transaction given a block number and transaction index position. |
| [**qanGetTransactionByHash**](QanApi.md#qanGetTransactionByHash) | **GET** /getTransactionByHash/{hash}/ | Returns the information about a transaction from a transaction hash. |
| [**qanGetTransactionCount**](QanApi.md#qanGetTransactionCount) | **GET** /getTransactionCount/{Address}/{BlockNumber}/ | Returns the number of transactions sent from an address. |
| [**qanGetTransactionReceipt**](QanApi.md#qanGetTransactionReceipt) | **GET** /getTransactionReceipt/{Hash}/ | Returns the receipt of a transaction by transaction hash. |
| [**qanMaxPriorityFeePerGas**](QanApi.md#qanMaxPriorityFeePerGas) | **GET** /maxPriorityFeePerGas/ | Get the priority fee needed to be included in a block. |
| [**qanNewBlockFilter**](QanApi.md#qanNewBlockFilter) | **GET** /newBlockFilter/ | Creates a filter in the node, to notify when a new block arrives. |
| [**qanNewFilter**](QanApi.md#qanNewFilter) | **POST** /newFilter/ | Creates a filter object, based on filter options, to notify when the state changes (logs). |
| [**qanNewPendingTransactionFilter**](QanApi.md#qanNewPendingTransactionFilter) | **GET** /newPendingTransactionFilter/ | Creates a filter in the node to notify when new pending transactions arrive. |
| [**qanSendRawTransaction**](QanApi.md#qanSendRawTransaction) | **POST** /sendRawTransaction/ | Creates new message call transaction or a contract creation for signed transactions. |
| [**qanSyncing**](QanApi.md#qanSyncing) | **GET** /syncing/ | Returns an object with the sync status of the node if the node is out-of-sync and is syncing. Returns null when the node is already in sync. |
| [**qanUninstallFilter**](QanApi.md#qanUninstallFilter) | **GET** /uninstallFilter/{FilterId}/ | Uninstalls a filter with the given filter id. |
| [**qanXlinkValid**](QanApi.md#qanXlinkValid) | **GET** /xlinkValid/{Address}/ | Returns the xlink validity time of the account of given address. |


<a id="qanBlockNumber"></a>
# **qanBlockNumber**
> OutputBlockNumber qanBlockNumber()

Returns the latest block number of the blockchain.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    try {
      OutputBlockNumber result = apiInstance.qanBlockNumber();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanBlockNumber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OutputBlockNumber**](OutputBlockNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanCall"></a>
# **qanCall**
> OutputCall qanCall(inputCall)

Executes a new message call immediately without creating a transaction on the block chain.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    InputCall inputCall = new InputCall(); // InputCall | 
    try {
      OutputCall result = apiInstance.qanCall(inputCall);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanCall");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputCall** | [**InputCall**](InputCall.md)|  | |

### Return type

[**OutputCall**](OutputCall.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanChainId"></a>
# **qanChainId**
> OutputChainId qanChainId()

Returns the current network/chain ID, used to sign replay-protected transaction introduced in EIP-155.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    try {
      OutputChainId result = apiInstance.qanChainId();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanChainId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OutputChainId**](OutputChainId.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanEstimateGas"></a>
# **qanEstimateGas**
> OutputEstimateGas qanEstimateGas(inputEstimateGas)

Returns an estimation of gas for a given transaction.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    InputEstimateGas inputEstimateGas = new InputEstimateGas(); // InputEstimateGas | 
    try {
      OutputEstimateGas result = apiInstance.qanEstimateGas(inputEstimateGas);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanEstimateGas");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputEstimateGas** | [**InputEstimateGas**](InputEstimateGas.md)|  | |

### Return type

[**OutputEstimateGas**](OutputEstimateGas.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanFeeHistory"></a>
# **qanFeeHistory**
> OutputFeeHistory qanFeeHistory(inputFeeHistory)

Returns the collection of historical gas information.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    InputFeeHistory inputFeeHistory = new InputFeeHistory(); // InputFeeHistory | 
    try {
      OutputFeeHistory result = apiInstance.qanFeeHistory(inputFeeHistory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanFeeHistory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputFeeHistory** | [**InputFeeHistory**](InputFeeHistory.md)|  | |

### Return type

[**OutputFeeHistory**](OutputFeeHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGasPrice"></a>
# **qanGasPrice**
> OutputGasPrice qanGasPrice()

Returns the current gas price on the network in wei.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    try {
      OutputGasPrice result = apiInstance.qanGasPrice();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGasPrice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OutputGasPrice**](OutputGasPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetBalance"></a>
# **qanGetBalance**
> OutputGetBalance qanGetBalance(address, blockNumber)

Returns the balance of the account of given address.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String address = "0xa1e4380a3b1f749673e270229993ee55f35663b4"; // String | A 20 bytes long hexadecimal value representing an address
    String blockNumber = "latest"; // String | The block number in hexadecimal or decimal format or the string latest, earliest, pending
    try {
      OutputGetBalance result = apiInstance.qanGetBalance(address, blockNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **address** | **String**| A 20 bytes long hexadecimal value representing an address | |
| **blockNumber** | **String**| The block number in hexadecimal or decimal format or the string latest, earliest, pending | [optional] [default to latest] |

### Return type

[**OutputGetBalance**](OutputGetBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetBlockByHash"></a>
# **qanGetBlockByHash**
> OutputGetBlockByHash qanGetBlockByHash(hash, transactionDetailFlag)

Returns information of the block matching the given block hash.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String hash = "0x4e3a3754410177e6937ef1f84bba68ea139e8d1a2258c5f85db9f1cd715a1bdd"; // String | The hash (32 bytes) of the block
    Boolean transactionDetailFlag = false; // Boolean | The method returns the full transaction objects when this value is true otherwise, it returns only the hashes of the transactions
    try {
      OutputGetBlockByHash result = apiInstance.qanGetBlockByHash(hash, transactionDetailFlag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetBlockByHash");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hash** | **String**| The hash (32 bytes) of the block | |
| **transactionDetailFlag** | **Boolean**| The method returns the full transaction objects when this value is true otherwise, it returns only the hashes of the transactions | [default to false] |

### Return type

[**OutputGetBlockByHash**](OutputGetBlockByHash.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetBlockByNumber"></a>
# **qanGetBlockByNumber**
> OutputGetBlockByNumber qanGetBlockByNumber(blockNumber, transactionDetailFlag)

Returns information of the block matching the given block number.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String blockNumber = "latest"; // String | The block number in hexadecimal or decimal format or the string latest, earliest, pending
    Boolean transactionDetailFlag = false; // Boolean | The method returns the full transaction objects when this value is true otherwise, it returns only the hashes of the transactions
    try {
      OutputGetBlockByNumber result = apiInstance.qanGetBlockByNumber(blockNumber, transactionDetailFlag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetBlockByNumber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blockNumber** | **String**| The block number in hexadecimal or decimal format or the string latest, earliest, pending | [default to latest] |
| **transactionDetailFlag** | **Boolean**| The method returns the full transaction objects when this value is true otherwise, it returns only the hashes of the transactions | [default to false] |

### Return type

[**OutputGetBlockByNumber**](OutputGetBlockByNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetBlockReceipts"></a>
# **qanGetBlockReceipts**
> OutputGetBlockReceipts qanGetBlockReceipts(blockNumber)

Returns all transaction receipts for a given block.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String blockNumber = "latest"; // String | The block number in hexadecimal or decimal format or the string latest, earliest, pending
    try {
      OutputGetBlockReceipts result = apiInstance.qanGetBlockReceipts(blockNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetBlockReceipts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blockNumber** | **String**| The block number in hexadecimal or decimal format or the string latest, earliest, pending | [default to latest] |

### Return type

[**OutputGetBlockReceipts**](OutputGetBlockReceipts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetBlockTransactionCountByHash"></a>
# **qanGetBlockTransactionCountByHash**
> OutputGetBlockTransactionCountByHash qanGetBlockTransactionCountByHash(hash)

Returns the number of transactions for the block matching the given block hash.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String hash = "0x4e3a3754410177e6937ef1f84bba68ea139e8d1a2258c5f85db9f1cd715a1bdd"; // String | The hash of the block
    try {
      OutputGetBlockTransactionCountByHash result = apiInstance.qanGetBlockTransactionCountByHash(hash);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetBlockTransactionCountByHash");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hash** | **String**| The hash of the block | |

### Return type

[**OutputGetBlockTransactionCountByHash**](OutputGetBlockTransactionCountByHash.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetBlockTransactionCountByNumber"></a>
# **qanGetBlockTransactionCountByNumber**
> OutputGetBlockTransactionCountByNumber qanGetBlockTransactionCountByNumber(blockNumber)

Returns the number of transactions for the block matching the given block number.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String blockNumber = "latest"; // String | The block number in hexadecimal or decimal format or the string latest, earliest, pending
    try {
      OutputGetBlockTransactionCountByNumber result = apiInstance.qanGetBlockTransactionCountByNumber(blockNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetBlockTransactionCountByNumber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blockNumber** | **String**| The block number in hexadecimal or decimal format or the string latest, earliest, pending | |

### Return type

[**OutputGetBlockTransactionCountByNumber**](OutputGetBlockTransactionCountByNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetCode"></a>
# **qanGetCode**
> OutputGetCode qanGetCode(address, blockNumber)

Returns the compiled bytecode of a smart contract.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String address = "0xa1e4380a3b1f749673e270229993ee55f35663b4"; // String | The address of the smart contract from which the bytecode will be obtained
    String blockNumber = "latest"; // String | The block number in hexadecimal or decimal format or the string latest, earliest, pending
    try {
      OutputGetCode result = apiInstance.qanGetCode(address, blockNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **address** | **String**| The address of the smart contract from which the bytecode will be obtained | |
| **blockNumber** | **String**| The block number in hexadecimal or decimal format or the string latest, earliest, pending | [optional] [default to latest] |

### Return type

[**OutputGetCode**](OutputGetCode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetFilterChanges"></a>
# **qanGetFilterChanges**
> OutputGetFilterChanges qanGetFilterChanges(filterId)

Polling method for a filter, which returns an array of events that have occurred since the last poll.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String filterId = "filterId_example"; // String | The filter id that is returned from getFilterChangesnewFilter, getFilterChangesnewBlockFilter or getFilterChangesnewPendingTransactionFilter
    try {
      OutputGetFilterChanges result = apiInstance.qanGetFilterChanges(filterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetFilterChanges");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filterId** | **String**| The filter id that is returned from getFilterChangesnewFilter, getFilterChangesnewBlockFilter or getFilterChangesnewPendingTransactionFilter | |

### Return type

[**OutputGetFilterChanges**](OutputGetFilterChanges.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetFilterLogs"></a>
# **qanGetFilterLogs**
> OutputGetFilterLogs qanGetFilterLogs(id)

Returns an array of all logs matching filter with given id.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String id = "id_example"; // String | The filter ID
    try {
      OutputGetFilterLogs result = apiInstance.qanGetFilterLogs(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetFilterLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The filter ID | |

### Return type

[**OutputGetFilterLogs**](OutputGetFilterLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetLogs"></a>
# **qanGetLogs**
> OutputGetLogs qanGetLogs(inputGetLogs)

Returns an array of all logs matching a given filter object.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    InputGetLogs inputGetLogs = new InputGetLogs(); // InputGetLogs | 
    try {
      OutputGetLogs result = apiInstance.qanGetLogs(inputGetLogs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputGetLogs** | [**InputGetLogs**](InputGetLogs.md)|  | |

### Return type

[**OutputGetLogs**](OutputGetLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetProof"></a>
# **qanGetProof**
> OutputGetProof qanGetProof(inputGetProof)

Returns the account and storage values of the specified account including the Merkle-proof.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    InputGetProof inputGetProof = new InputGetProof(); // InputGetProof | 
    try {
      OutputGetProof result = apiInstance.qanGetProof(inputGetProof);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetProof");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputGetProof** | [**InputGetProof**](InputGetProof.md)|  | |

### Return type

[**OutputGetProof**](OutputGetProof.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetStorageAt"></a>
# **qanGetStorageAt**
> OutputGetStorageAt qanGetStorageAt(inputGetStorageAt)

Returns the value from a storage position at a given address.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    InputGetStorageAt inputGetStorageAt = new InputGetStorageAt(); // InputGetStorageAt | 
    try {
      OutputGetStorageAt result = apiInstance.qanGetStorageAt(inputGetStorageAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetStorageAt");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputGetStorageAt** | [**InputGetStorageAt**](InputGetStorageAt.md)|  | |

### Return type

[**OutputGetStorageAt**](OutputGetStorageAt.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetTransactionByBlockHashAndIndex"></a>
# **qanGetTransactionByBlockHashAndIndex**
> OutputGetTransactionByBlockHashAndIndex qanGetTransactionByBlockHashAndIndex(blockHash, index)

Returns information about a transaction given a blockhash and transaction index position.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String blockHash = "0x4e3a3754410177e6937ef1f84bba68ea139e8d1a2258c5f85db9f1cd715a1bdd"; // String | 
    String index = "0"; // String | An integer of the transaction index position
    try {
      OutputGetTransactionByBlockHashAndIndex result = apiInstance.qanGetTransactionByBlockHashAndIndex(blockHash, index);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetTransactionByBlockHashAndIndex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blockHash** | **String**|  | |
| **index** | **String**| An integer of the transaction index position | |

### Return type

[**OutputGetTransactionByBlockHashAndIndex**](OutputGetTransactionByBlockHashAndIndex.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetTransactionByBlockNumberAndIndex"></a>
# **qanGetTransactionByBlockNumberAndIndex**
> OutputGetTransactionByBlockNumberAndIndex qanGetTransactionByBlockNumberAndIndex(blockNumber, index)

Returns information about a transaction given a block number and transaction index position.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String blockNumber = "latest"; // String | The block number in hexadecimal or decimal format or the string latest, earliest, pending
    String index = "0"; // String | An integer of the transaction index position
    try {
      OutputGetTransactionByBlockNumberAndIndex result = apiInstance.qanGetTransactionByBlockNumberAndIndex(blockNumber, index);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetTransactionByBlockNumberAndIndex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blockNumber** | **String**| The block number in hexadecimal or decimal format or the string latest, earliest, pending | |
| **index** | **String**| An integer of the transaction index position | |

### Return type

[**OutputGetTransactionByBlockNumberAndIndex**](OutputGetTransactionByBlockNumberAndIndex.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetTransactionByHash"></a>
# **qanGetTransactionByHash**
> OutputGetTransactionByHash qanGetTransactionByHash(hash)

Returns the information about a transaction from a transaction hash.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String hash = "0x5c504ed432cb51138bcf09aa5e8a410dd4a1e204ef84bfed1be16dfba1b22060"; // String | The hash of a transaction
    try {
      OutputGetTransactionByHash result = apiInstance.qanGetTransactionByHash(hash);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetTransactionByHash");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hash** | **String**| The hash of a transaction | |

### Return type

[**OutputGetTransactionByHash**](OutputGetTransactionByHash.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetTransactionCount"></a>
# **qanGetTransactionCount**
> OutputGetTransactionCount qanGetTransactionCount(address, blockNumber)

Returns the number of transactions sent from an address.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String address = "0xa1e4380a3b1f749673e270229993ee55f35663b4"; // String | The address from which the transaction count to be checked
    String blockNumber = "latest"; // String | The block number in hexadecimal or decimal format or the string latest, earliest, pending
    try {
      OutputGetTransactionCount result = apiInstance.qanGetTransactionCount(address, blockNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetTransactionCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **address** | **String**| The address from which the transaction count to be checked | |
| **blockNumber** | **String**| The block number in hexadecimal or decimal format or the string latest, earliest, pending | |

### Return type

[**OutputGetTransactionCount**](OutputGetTransactionCount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanGetTransactionReceipt"></a>
# **qanGetTransactionReceipt**
> OutputGetTransactionReceipt qanGetTransactionReceipt(hash)

Returns the receipt of a transaction by transaction hash.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String hash = "0x4e3a3754410177e6937ef1f84bba68ea139e8d1a2258c5f85db9f1cd715a1bdd"; // String | The hash of a transaction
    try {
      OutputGetTransactionReceipt result = apiInstance.qanGetTransactionReceipt(hash);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanGetTransactionReceipt");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hash** | **String**| The hash of a transaction | |

### Return type

[**OutputGetTransactionReceipt**](OutputGetTransactionReceipt.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanMaxPriorityFeePerGas"></a>
# **qanMaxPriorityFeePerGas**
> OutputMaxPriorityFeePerGas qanMaxPriorityFeePerGas()

Get the priority fee needed to be included in a block.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    try {
      OutputMaxPriorityFeePerGas result = apiInstance.qanMaxPriorityFeePerGas();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanMaxPriorityFeePerGas");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OutputMaxPriorityFeePerGas**](OutputMaxPriorityFeePerGas.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanNewBlockFilter"></a>
# **qanNewBlockFilter**
> OutputNewBlockFilter qanNewBlockFilter()

Creates a filter in the node, to notify when a new block arrives.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    try {
      OutputNewBlockFilter result = apiInstance.qanNewBlockFilter();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanNewBlockFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OutputNewBlockFilter**](OutputNewBlockFilter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanNewFilter"></a>
# **qanNewFilter**
> OutputNewFilter qanNewFilter(inputNewFilter)

Creates a filter object, based on filter options, to notify when the state changes (logs).

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    InputNewFilter inputNewFilter = new InputNewFilter(); // InputNewFilter | 
    try {
      OutputNewFilter result = apiInstance.qanNewFilter(inputNewFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanNewFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputNewFilter** | [**InputNewFilter**](InputNewFilter.md)|  | |

### Return type

[**OutputNewFilter**](OutputNewFilter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanNewPendingTransactionFilter"></a>
# **qanNewPendingTransactionFilter**
> OutputNewPendingTransactionFilter qanNewPendingTransactionFilter()

Creates a filter in the node to notify when new pending transactions arrive.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    try {
      OutputNewPendingTransactionFilter result = apiInstance.qanNewPendingTransactionFilter();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanNewPendingTransactionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OutputNewPendingTransactionFilter**](OutputNewPendingTransactionFilter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanSendRawTransaction"></a>
# **qanSendRawTransaction**
> OutputSendRawTransaction qanSendRawTransaction(inputSendRawTransaction)

Creates new message call transaction or a contract creation for signed transactions.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    InputSendRawTransaction inputSendRawTransaction = new InputSendRawTransaction(); // InputSendRawTransaction | 
    try {
      OutputSendRawTransaction result = apiInstance.qanSendRawTransaction(inputSendRawTransaction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanSendRawTransaction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inputSendRawTransaction** | [**InputSendRawTransaction**](InputSendRawTransaction.md)|  | |

### Return type

[**OutputSendRawTransaction**](OutputSendRawTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanSyncing"></a>
# **qanSyncing**
> OutputSyncing qanSyncing()

Returns an object with the sync status of the node if the node is out-of-sync and is syncing. Returns null when the node is already in sync.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    try {
      OutputSyncing result = apiInstance.qanSyncing();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanSyncing");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OutputSyncing**](OutputSyncing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanUninstallFilter"></a>
# **qanUninstallFilter**
> OutputUninstallFilter qanUninstallFilter(filterId)

Uninstalls a filter with the given filter id.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String filterId = "filterId_example"; // String | The filter ID that needs to be uninstalled. It should always be called when watch is no longer needed. Additionally, Filters timeout when they aren't requested with getFilterChanges for a period of time
    try {
      OutputUninstallFilter result = apiInstance.qanUninstallFilter(filterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanUninstallFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filterId** | **String**| The filter ID that needs to be uninstalled. It should always be called when watch is no longer needed. Additionally, Filters timeout when they aren&#39;t requested with getFilterChanges for a period of time | |

### Return type

[**OutputUninstallFilter**](OutputUninstallFilter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="qanXlinkValid"></a>
# **qanXlinkValid**
> OutputXlinkValid qanXlinkValid(address)

Returns the xlink validity time of the account of given address.

### Example
```java
// Import classes:
import com.qanplatform.invoker.ApiClient;
import com.qanplatform.invoker.ApiException;
import com.qanplatform.invoker.Configuration;
import com.qanplatform.invoker.models.*;
import org.openapitools.client.api.QanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rpc-testnet.qanplatform.com");

    QanApi apiInstance = new QanApi(defaultClient);
    String address = "address_example"; // String | 
    try {
      OutputXlinkValid result = apiInstance.qanXlinkValid(address);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QanApi#qanXlinkValid");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **address** | **String**|  | |

### Return type

[**OutputXlinkValid**](OutputXlinkValid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

