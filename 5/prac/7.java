public class ContractCreator extends DocumentCreator {
    @Override
    public Document CreateDocument() {
        return new Contract();
    }
}
