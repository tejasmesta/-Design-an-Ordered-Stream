class OrderedStream {
    String[] stream;
    int ptr = 0;

    public OrderedStream(int n) 
    {
        this.stream = new String[n];
    }

    public List<String> insert(int idKey, String value)
    {
        stream[idKey - 1] = value;

        List<String> result = new ArrayList<>();
        
        for (int i = ptr; i < stream.length; i++) 
        {
            String element = this.stream[i];

            if (element == null) {
                break;
            }
            
            result.add(element);
            ptr++;
        }

        return result;
    }
}
