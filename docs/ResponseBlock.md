

# ResponseBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseFeePerGas** | **String** | A string of the base fee encoded in decimal format. Please note that this response field will not be included in a block requested before the EIP-1559 upgrade |  |
|**difficulty** | **String** | The integer of the difficulty for this block encoded as a decimal |  |
|**extraData** | **String** | The “extra data” field of this block |  |
|**gasLimit** | **String** | The maximum gas allowed in this block encoded as a decimal |  |
|**gasUsed** | **String** | The total used gas by all transactions in this block encoded as a decimal |  |
|**hash** | **String** | The block hash of the requested block. null if pending |  |
|**logsBloom** | **String** | The bloom filter for the logs of the block. null if pending |  |
|**miner** | **String** | The address of the beneficiary to whom the mining rewards were given |  |
|**mixHash** | **String** | A string of a 256-bit hash encoded as a decimal |  |
|**nonce** | **String** | The hash of the generated proof-of-work. null if pending |  |
|**number** | **String** | The block number of the requested block encoded as a decimal. null if pending |  |
|**parentHash** | **String** | The hash of the parent block |  |
|**receiptsRoot** | **String** | The root of the receipts trie of the bloc |  |
|**sha3Uncles** | **String** | The SHA3 of the uncles data in the block |  |
|**size** | **String** | The size of this block in bytes as an Integer value encoded as decimal |  |
|**stateRoot** | **String** | The root of the final state trie of the block |  |
|**timestamp** | **String** | The unix timestamp for when the block was collated |  |
|**totalDifficulty** | **String** | The integer of the total difficulty of the chain until this block encoded as a decimal |  |
|**transactions** | [**List&lt;ResponseTransaction&gt;**](ResponseTransaction.md) | An array of transaction objects - please see getTransactionByHash for exact shape |  |
|**transactionsRoot** | **String** | The root of the transaction trie of the block |  |
|**uncles** | **List&lt;String&gt;** | An array of uncle hashes |  |
|**withdrawals** | [**ResponseWithdrawals**](ResponseWithdrawals.md) | A withdrawals object contains information about withdrawals made by validators. Please note that this field will not be included in a block requested before the EIP-4895 upgrade |  |
|**withdrawalsRoot** | **String** | The Merkle root of withdrawal data. Also, please note that this field will not be included in a block requested before the EIP-4895 upgrade |  |



