

# ResponseTransactionReceipt


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockHash** | **String** | The hash of the block. null when pending |  [optional] |
|**blockNumber** | **String** |  |  [optional] |
|**contractAddress** | **String** | The contract address created if the transaction was a contract creation, otherwise null |  [optional] |
|**cumulativeGasUsed** | **String** | The total amount of gas used when this transaction was executed in the block |  [optional] |
|**effectiveGasPrice** | **String** | The actual value per gas deducted from the sender account |  [optional] |
|**from** | **String** | The address of the sender |  [optional] |
|**gasUsed** | **String** | The amount of gas used by this specific transaction alone |  [optional] |
|**logs** | [**List&lt;ResponseLog&gt;**](ResponseLog.md) | An array of log objects that generated this transaction |  [optional] |
|**logsBloom** | **String** | The bloom filter for light clients to quickly retrieve related logs |  [optional] |
|**status** | **String** | It is either 1 (success) or 0 (failure) encoded as a decimal |  [optional] |
|**to** | **String** | The address of the receiver. null when it&#39;s a contract creation transaction |  [optional] |
|**transactionHash** | **String** | The hash of the transaction |  [optional] |
|**transactionIndex** | **String** | An index of the transaction in the block |  [optional] |
|**type** | **String** | The value type |  [optional] |



