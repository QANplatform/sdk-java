

# ResponseTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessList** | **String** | A list of addresses and storage keys that the transaction plans to access |  [optional] |
|**blockHash** | **String** | The hash of the block where this transaction was in. Null when it&#39;s a pending transaction |  [optional] |
|**blockNumber** | **String** | The block number where this transaction was in. Null when it&#39;s a pending transaction |  [optional] |
|**chainId** | **String** | The chain id of the transaction, if any |  [optional] |
|**from** | **String** | The address of the sender |  [optional] |
|**gas** | **String** | The gas provided by the sender, encoded as decimal |  [optional] |
|**gasPrice** | **String** | The gas price provided by the sender in wei encoded as decimal |  [optional] |
|**hash** | **String** | The hash of the transaction |  [optional] |
|**input** | **String** | The data sent along with the transaction |  [optional] |
|**maxFeePerGas** | **String** | The maximum fee per gas set in the transaction |  [optional] |
|**maxPriorityFeePerGas** | **String** | The maximum priority gas fee set in the transaction |  [optional] |
|**nonce** | **String** | The number of transactions made by the sender prior to this one encoded as decimal |  [optional] |
|**R** | **String** | The R field of the signature |  [optional] |
|**S** | **String** | The S field of the signature |  [optional] |
|**to** | **String** | The address of the receiver. Null when its a contract creation transaction |  [optional] |
|**transactionIndex** | **String** | The integer of the transaction&#39;s index position that the log was created from. Null when it&#39;s a pending log |  [optional] |
|**type** | **String** | The transaction type |  [optional] |
|**V** | **String** | The standardized V field of the signature |  [optional] |
|**value** | **String** | The value transferred in wei encoded as decimal |  [optional] |



