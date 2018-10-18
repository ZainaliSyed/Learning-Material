# Fabric

- Fabric introduces a new architecture for transactions that we call execute-order-validate.

1. execute a transaction and check its correctness, thereby endorsing it.
2. order transactions via a (`pluggable`) consensus protocol
3. validate transactions against an `application-specific endorsement policy` before committing them to the ledger

- **Three main Concept** Fabric CA, Pear and Ordering Service. [core concept](https://www.youtube.com/watch?v=k4KKrQOV6SE)

- `Peer Nodes :` execute and verify transactions

- `Ordering Nodes :` ordering nodes and propagates transactions

# Private Channel

- make your transactions safe and valid and data hiding from other companies

# Summary

## Five main concepts

- Can defined `Assets types` and `consensus protocols`
- Can set `Permissions` on who can joins Networks
- Two types of node `Peer` and `Ordering`
- Ledger consists of database of the `current assets` and a log transactions
- Assets are updated added using `chain node`
